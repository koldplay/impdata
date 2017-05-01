<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<EmployeeDetails>
			<xsl:for-each select="Employees/Employee">
				<Employee>
					<empid>
						<xsl:value-of select="empid" />
					</empid>
					<empname>
						<xsl:value-of select="empname" />
					</empname>
					<salary>
						<xsl:value-of select="salary" />
					</salary>
				</Employee>
			</xsl:for-each>
		</EmployeeDetails>
	</xsl:template>
</xsl:stylesheet>