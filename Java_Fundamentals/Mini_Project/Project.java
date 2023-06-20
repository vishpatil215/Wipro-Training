class Project{
    public static void main(String[] args) {
        String emp [][] = {{"1001","1002","1003","1004","1005","1006","1007"},
                            {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"},
                            {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"},
                            {"e","c","k","r","m","e","c"},
                            {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"},
                            {"20000","30000","10000","12000","50000","23000","29000"},
                            {"8000","12000","8000","6000","20000","9000","12000"},
                            {"3000","9000","1000","2000","20000","4400","10000"}};
        String DA[][] ={{"e","c","k","r","m"},
                        {"Engineer","Consultant","Clerk","Receptionist","Manager"},
                        {"20000","32000","12000","15000","40000"},};
        String basic=null,da=null,HRA=null,IT=null,emp_name=null,dept=null,deg=null,code=null;
        int sal=0;
        String empId = args[0];
        for(int i=0;i<emp[0].length;i++)
        {
            if(emp[0][i].equals(empId))
                {
                    basic=emp[5][i];
                    code=emp[3][i];
                    emp_name=emp[1][i];
                    HRA=emp[6][i];
                    dept=emp[4][i];
                    IT=emp[7][i];
                }
        }
      
        for(int i = 0;i<DA[0].length;i++)
        {
            if(DA[0][i].equals(code))
            {
                da=DA[2][i];
                deg=DA[1][i];
            }
        }
        if(basic!=null)
            sal=Integer.parseInt(basic)+Integer.parseInt(HRA)+Integer.parseInt(da)-Integer.parseInt(IT);
        System.out.println("Emp No.  Emp Name  Department  Designation  Salary");
        System.out.println(empId+"    "+emp_name+"    "+dept+"    "+deg+"    "+sal);
    }
}