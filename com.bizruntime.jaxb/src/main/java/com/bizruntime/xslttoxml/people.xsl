<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<table>
					<tr>
						<th>name</th>
						<th>address</th>
						<th>tel</th>
						<th>email</th>
					</tr>
					<xsl:for-each select="people/person">
					<tagalist>kjsdhfkjnr</tagalist>	
						<tr>
							<td><xsl:value-of select="name"></xsl:value-of></td>
							<td><xsl:value-of select="address"></xsl:value-of></td>
							<td><xsl:value-of select="tel"></xsl:value-of></td>
							<td><xsl:value-of select="email"></xsl:value-of></td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>