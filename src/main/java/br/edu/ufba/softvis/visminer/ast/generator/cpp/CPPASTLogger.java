package br.edu.ufba.softvis.visminer.ast.generator.cpp;

import org.eclipse.cdt.core.parser.IParserLogService;

public class CPPASTLogger implements IParserLogService {

	public boolean isTracing() {
		return true;
	}

	public void traceLog(String log) {
		System.out.println("CPPASTLogger::traceLog: " + log);
	}
}
