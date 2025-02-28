import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ApexMethodExtractor {
    public static void main(String[] args) throws IOException {
        // Ensure the class name is passed as an argument
        if (args.length < 1) {
            System.err.println("Usage: java ApexMethodExtractor <path_to_apex_class>");
            return;
        }

        String fileName = args[0];

        // Load the file and create an input stream
        FileInputStream inputStream = new FileInputStream(fileName);

        // Create a lexer and token stream
        apexLexer lexer = new apexLexer(CharStreams.fromStream(inputStream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser using the tokens
        apexParser parser = new apexParser(tokens);

        // Parse the input file (root rule might vary)
        ParseTree tree = parser.compilationUnit();

        // Visit the tree using the custom visitor
        MethodVisitor visitor = new MethodVisitor();
        visitor.visit(tree);
    }

    // Custom visitor class to extract methods
    static class MethodVisitor extends apexBaseVisitor<Void> {
        @Override
        public Void visitMethodDeclaration(apexParser.MethodDeclarationContext ctx) {
            // Extract method name
            String methodName = ctx.Identifier().getText();
            System.out.println("Method found: " + methodName);
            return null;
        }
    }
}