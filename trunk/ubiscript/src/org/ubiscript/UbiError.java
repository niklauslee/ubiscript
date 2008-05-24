package org.ubiscript;

@SuppressWarnings("serial") //$NON-NLS-1$
public class UbiError extends UbiException {
	private int line = -1;
	private int charPositionInLine = -1;
	public UbiError(int line, int position, String message) {
		super(message);
		this.line = line;
		this.charPositionInLine = position;
	}
	public int getCharPositionInLine() {
		return charPositionInLine;
	}
	public int getLine() {
		return line;
	}
	/*
	public static void checkType(UbiObject o, Class c) throws UbiException {
		if (!c.isInstance(o))
			throw new UbiError(-1, -1, o + "(" + o.getClass() + ")" + " requires type " + c);
	}
	*/
	/*
	public static void assertThat(boolean condition) throws UbiException {
		if (!condition) throw new UbiError(-1, -1, "error.");
	}
	*/
	/*
	public static void syntaxError(int line, int position) throws UbiException {
		throw new UbiError(line, position, "Syntax Error.");
	}
	*/

	/*
	public static void error(String message, int line, int position) throws UbiException {
		throw new UbiError(line, position, message);
	}
	*/

	public static void throwSyntaxError(int line, int position, String message) throws UbiError {
		throw new UbiError(line, position,
				String.format(Messages.getString("error.syntax"), line, position, message));
	}
	
	public static void throwRuntimeError(int line, int position, String message) throws UbiError {
		throw new UbiError(line, position,
				String.format(Messages.getString("error.runtime"), line, position, message));
	}

	public static void throwReferenceError(int line, int position, UbiRef ref) throws UbiError {
		throw new UbiError(-1, -1,
				String.format(Messages.getString("error.reference"), line, position, ref.getName()));
	}

}
