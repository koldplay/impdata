<?xml version = "1.0" encoding = "UTF-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">   

   <xsl:template match = "/"> 
       
		
      <html> 
         <body> 
            <h2>Students</h2> 
				
            <table border = "1"> 
               <tr bgcolor = "#9acd32"> 
                  <th>Roll No</th> 
                  <th>First Name</th> 
                  <th>Last Name</th> 
                  <th>Nick Name</th> 
                  <th>Marks</th> 
               </tr> 
				
               <!-- for-each processing instruction 
               Looks for each element matching the XPath expression 
               --> 
				
               <xsl:for-each select="class/student"> 
                  <tr> 
                     <td> 
                        <!-- value-of processing instruction 
                        process the value of the element matching the XPath expression 
                        --> 
                        <xsl:value-of select = "@rollno"/> 
                     </td> 
						
                     <td><xsl:value-of select = "firstname" disable-output-escaping="yesy"/></td> 
                     <td><xsl:value-of select = "lastname"/></td> 
                     <td><xsl:value-of select = "nickname"/></td> 
                     <td><xsl:value-of select = "marks"/></td> 
						
                  </tr> 
               </xsl:for-each> 
					
            </table> 
         </body> 
      </html> 
   </xsl:template>  
</xsl:stylesheet>