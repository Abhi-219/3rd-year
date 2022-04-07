<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
    <html>
    <body>
    <table border="1">
        <tr bgcolor="#9acd32">
            <th>Question</th>
            <th>optionA</th>
            <th>optionB</th>
            <th>optionC</th>
            <th>optionD</th>
            <th>Ans</th>
        </tr>
        <xsl:for-each select = "question-paper/question">
            <tr>
                <td><xsl:value-of select = "text"/></td>
                <td><xsl:value-of select = "optionA"/></td>
                <td><xsl:value-of select = "optionB"/></td>
                <td><xsl:value-of select = "optionC"/></td>
                <td><xsl:value-of select = "optionD"/></td>
                <td><xsl:value-of select = "answer"/></td>
            </tr>
        </xsl:for-each>
    </table>
    </body>
    </html>
    </xsl:template>
</xsl:stylesheet>