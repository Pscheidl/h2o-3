package water.parser;

import water.fvec.ByteVec;

public abstract class BinaryParserProvider extends ParserProvider {

  @Override
  public abstract ParseSetup guessFormatSetup(ByteVec v, byte[] bits, ParseSetup userSetup);

  @Override
  public abstract ParseSetup guessDataSetup(ByteVec v, byte[] bits, ParseSetup ps);

  @Override
  @Deprecated
  public final ParseSetup guessSetup(ByteVec v, byte[] bits, byte sep, int ncols, boolean singleQuotes, int checkHeader, String[] columnNames, byte[] columnTypes, String[][] domains, String[][] naStrings) {
    ParseSetup ps = new ParseSetup(null, sep, singleQuotes, checkHeader,
            ncols, columnNames, columnTypes, domains, naStrings, null);
    return guessSetup(v, bits, ps);
  }

}
