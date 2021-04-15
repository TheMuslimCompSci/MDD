/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.tracery.generator

import uk.ac.kcl.inf.languages.tracery.traceryLanguage.LastJSONStatement
import org.eclipse.emf.ecore.resource.Resource
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.VariableDeclarationImpl
import org.eclipse.xtext.generator.AbstractGenerator
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.StringDeclarationImpl
import org.eclipse.xtext.generator.IFileSystemAccess2
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.StandardVal
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.InitialValImpl
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.FirstJSONStatements
import java.util.ArrayList
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.impl.FirstJSONStatementsImpl
import uk.ac.kcl.inf.languages.tracery.traceryLanguage.TraceryProgram

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TraceryLanguageGenerator extends AbstractGenerator {
	
	def generate(TraceryProgram program) {
		val instructions = program.instructions.head.eContents	

	'''
{
�FOR instruction : instructions���� iterate through all instructions in the grammar
�val sections = new ArrayList()���� each section of the grammar object will be stored in a list 
�IF FirstJSONStatementsImpl == instruction.class���� check if the first JSON statement is the same as the current instruction class
�val JSONStatement = instruction as FirstJSONStatements�
�val value = JSONStatement.value as InitialValImpl�
�val internalInstruction = value.valInternalInstruction�
�FOR sectionsArray : internalInstruction���� iterate through all sections of the inner instructions in the grammar
�IF StringDeclarationImpl != sectionsArray.class���� check if the declared string is the same as the current section
�val variableDeclaration = sectionsArray as VariableDeclarationImpl�
�val variable = variableDeclaration.variable as FirstJSONStatements�
�val finish = sections.add(' "#' + variable.name + '#"')���� Enclose the current symbol in hashtags if it is a symbol to finish off
�ELSE�
�val declareString = sectionsArray as StringDeclarationImpl�
�val finish = sections.add('"' + declareString.value + '"')���� Enclose the current symbol in speech marks if it is a string to finish off
�ENDIF�
�ENDFOR�
�val externalInstruction = value.vals�
�FOR StandardVal standardValue : externalInstruction���� iterate through all standard values of the outer instructions in the grammar
�val internalStandard = standardValue.valInternalInstruction�
�FOR sectionsArray : internalStandard���� iterate through all sections of the inner instructions that have standard values in the grammar							
�IF StringDeclarationImpl != sectionsArray.class���� check if the declared string is the same as the current section
�val variableDeclaration = sectionsArray as VariableDeclarationImpl�
�val variable = variableDeclaration.variable as FirstJSONStatements�
�val finish = sections.add(' "#' + variable.name + '#"')���� Enclose the current symbol in hashtags if it is a symbol to finish off	
�ELSE�
�val declareString = sectionsArray as StringDeclarationImpl�
�val finish = sections.add('"' + declareString.value + '"')���� Enclose the current symbol in speech marks if it is a string to finish off							
�ENDIF�
�ENDFOR�
�ENDFOR�
�'\t' + '"' + JSONStatement.getName() + '"' + ": [" + sections.join(",") + "],"���� Format the grammar object correctly		
�ELSE�
�val JSONStatement = instruction as LastJSONStatement�
�val value = JSONStatement.value as InitialValImpl�
�val internalInstruction = value.valInternalInstruction�
�FOR sectionsArray : internalInstruction���� iterate through all sections of the inner instructions in the grammar	
�IF StringDeclarationImpl != sectionsArray.class���� check if the declared string is the same as the current section				
�val variableDeclaration = sectionsArray as VariableDeclarationImpl�
�val variable = variableDeclaration.variable as FirstJSONStatements�
�val finish = sections.add(' "#' + variable.name + '#"')���� Enclose the current symbol in hashtags if it is a symbol to finish off																	
�ELSE�
�val declareString = sectionsArray as StringDeclarationImpl�
�val finish = sections.add('"' + declareString.value + '"')���� Enclose the current symbol in speech marks if it is a string to finish off						
�ENDIF�
�ENDFOR�
�val externalInstruction = value.vals�
�FOR StandardVal standardValue : externalInstruction���� iterate through all standard values of the outer instructions in the grammar				
�val internalStandard = standardValue.valInternalInstruction�
�FOR sectionsArray : internalStandard���� iterate through all sections of the inner instructions that have standard values in the grammar						
�IF StringDeclarationImpl != sectionsArray.class���� check if the declared string is the same as the current section										
�val variableDeclaration = sectionsArray as VariableDeclarationImpl�
�val variable = variableDeclaration.variable as FirstJSONStatements�
�val finish = sections.add(' "#' + variable.name + '#"')���� Enclose the current symbol in hashtags if it is a symbol to finish off
�ELSE�	
�val declareString = sectionsArray as StringDeclarationImpl�
�val finish = sections.add('"' + declareString.value + '"')���� Enclose the current symbol in speech marks if it is a string to finish off						

�ENDIF�
�ENDFOR�
�ENDFOR�
��� Format the grammar object correctly						
�'\t' + '"' + "origin" + '"' + ": [" + sections.join(",")  + "]"�
�ENDIF�
�ENDFOR�
}
'''

	}	

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as TraceryProgram
		
		fsa.generateFile(deriveTargetFileNameFor(model, resource), model.generate)
	}
	
	def deriveTargetFileNameFor(TraceryProgram program, Resource resource) {
		resource.URI.appendFileExtension('txt').lastSegment
	}
	
}