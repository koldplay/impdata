<Employees>{
          for $x in /Employees/Employee
          where $x/@id = '10'         
          return $x
          }          
 </Employees>

