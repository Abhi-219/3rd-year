Compiled from "Connection.java"
public interface java.sql.Connection extends java.sql.Wrapper{
    public static final int TRANSACTION_NONE;
    public static final int TRANSACTION_READ_UNCOMMITTED;
    public static final int TRANSACTION_READ_COMMITTED;
    public static final int TRANSACTION_REPEATABLE_READ;
    public static final int TRANSACTION_SERIALIZABLE;
    public abstract java.sql.Statement createStatement()       throws java.sql.SQLException;
    public abstract java.sql.PreparedStatement prepareStatement(java.lang.String)       throws java.sql.SQLException;
    public abstract java.sql.CallableStatement prepareCall(java.lang.String)       throws java.sql.SQLException;
    public abstract java.lang.String nativeSQL(java.lang.String)       throws java.sql.SQLException;
    public abstract void setAutoCommit(boolean)       throws java.sql.SQLException;
    public abstract boolean getAutoCommit()       throws java.sql.SQLException;
    public abstract void commit()       throws java.sql.SQLException;
    public abstract void rollback()       throws java.sql.SQLException;
    public abstract void close()       throws java.sql.SQLException;
    public abstract boolean isClosed()       throws java.sql.SQLException;
    public abstract java.sql.DatabaseMetaData getMetaData()       throws java.sql.SQLException;
    public abstract void setReadOnly(boolean)       throws java.sql.SQLException;
    public abstract boolean isReadOnly()       throws java.sql.SQLException;
    public abstract void setCatalog(java.lang.String)       throws java.sql.SQLException;
    public abstract java.lang.String getCatalog()       throws java.sql.SQLException;
    public abstract void setTransactionIsolation(int)       throws java.sql.SQLException;
    public abstract int getTransactionIsolation()       throws java.sql.SQLException;
    public abstract java.sql.SQLWarning getWarnings()       throws java.sql.SQLException;
    public abstract void clearWarnings()       throws java.sql.SQLException;
    public abstract java.sql.Statement createStatement(int, int)       throws java.sql.SQLException;
    public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int, int)       throws java.sql.SQLException;
    public abstract java.sql.CallableStatement prepareCall(java.lang.String, int, int)       throws java.sql.SQLException;
    public abstract java.util.Map getTypeMap()       throws java.sql.SQLException;
    public abstract void setTypeMap(java.util.Map)       throws java.sql.SQLException;
    public abstract void setHoldability(int)       throws java.sql.SQLException;
    public abstract int getHoldability()       throws java.sql.SQLException;
    public abstract java.sql.Savepoint setSavepoint()       throws java.sql.SQLException;
    public abstract java.sql.Savepoint setSavepoint(java.lang.String)       throws java.sql.SQLException;
    public abstract void rollback(java.sql.Savepoint)       throws java.sql.SQLException;
    public abstract void releaseSavepoint(java.sql.Savepoint)       throws java.sql.SQLException;
    public abstract java.sql.Statement createStatement(int, int, int)       throws java.sql.SQLException;
    public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int, int, int)       throws java.sql.SQLException;
    public abstract java.sql.CallableStatement prepareCall(java.lang.String, int, int, int)       throws java.sql.SQLException;
    public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int)       throws java.sql.SQLException;
    public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, int[])       throws java.sql.SQLException;
    public abstract java.sql.PreparedStatement prepareStatement(java.lang.String, java.lang.String[])       throws java.sql.SQLException;
    public abstract java.sql.Clob createClob()       throws java.sql.SQLException;
    public abstract java.sql.Blob createBlob()       throws java.sql.SQLException;
    public abstract java.sql.NClob createNClob()       throws java.sql.SQLException;
    public abstract java.sql.SQLXML createSQLXML()       throws java.sql.SQLException;
    public abstract boolean isValid(int)       throws java.sql.SQLException;
    public abstract void setClientInfo(java.lang.String, java.lang.String)       throws java.sql.SQLClientInfoException;
    public abstract void setClientInfo(java.util.Properties)       throws java.sql.SQLClientInfoException;
    public abstract java.lang.String getClientInfo(java.lang.String)       throws java.sql.SQLException;
    public abstract java.util.Properties getClientInfo()       throws java.sql.SQLException;
    public abstract java.sql.Array createArrayOf(java.lang.String, java.lang.Object[])       throws java.sql.SQLException;
    public abstract java.sql.Struct createStruct(java.lang.String, java.lang.Object[])       throws java.sql.SQLException;
}
