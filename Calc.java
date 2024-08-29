import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Calc {
    public static void main(String[] args) throws IOException {
        // Verifica si se proporcionó un archivo de entrada
        if (args.length == 0) {
            System.err.println("Usage: java Calc <input file>");
            return;
        }

        // Lee el archivo de entrada
        String inputFile = args[0];
        CharStream input = CharStreams.fromFileName(inputFile);

        // Crea el lexer y parser
        LabeledExprLexer lexer = new LabeledExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);

        // Parsear el archivo de entrada
        ParseTree tree = parser.prog(); // 'prog' es la regla inicial en LabeledExpr.g4

        // Crear un visitante y evaluar las expresiones
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
