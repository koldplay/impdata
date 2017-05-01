<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:java="java">

	<xsl:template match="/">
		<xsl:variable name="get" select="java:com.test.CAMELPROJECTTASK7A.MethodInvoke" />
		<FirstName>
			<xsl:value-of select="java:get.getData(Exchange)" />
		</FirstName>
		<LastName>
			<xsl:value-of select="/Employees/Employee/empid" />
		</LastName>
	</xsl:template>
</xsl:stylesheet>