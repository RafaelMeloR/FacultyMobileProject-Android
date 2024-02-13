# FacultyMobileProject-Android

a) Create an Android Project named FacultyMobileProject to add more widgets to layout 
resource defining UI activity. Add six TextView widgets, two Button widgets placed 
within horizontal LinearLayout to allow mobile user to read faculty information stored 
into collection of hash map objects and displaying each element within TextView widget as 
shown hereafter in Figure.
b) Create Faculty class which represents Model class of MVC pattern and defines data 
attributes of every student grade record with the following fields: f_id (int), f_lname 
(string), f_fname (string), f_salary (double), f_bonus(double).
• Add default constructor and constructor with parameters.
• Add public Mutator (setter) and Accessor (getter) methods in Faculty class
• Add a method within Faculty class called (calcBonus ()) that calculates and returns the 
total bonus such as: T_Bonus = f_Salary*f_Bonus/100
c) Add button “Next Faculty” to skip through each next element of Faculty hash 
maps and displays faculty info within TextView widgets as shown hereafter in Figure.
Populate hash map elements to be set to the following record values:
(101,"Robertson", "Myra",60000.00,2.50)
(212,"Smith","Neal",40000.00,3.00)
(315,"Arlec", "Lisa", 55000.00, 1.50)
(857,"Fillipo", "Paul", 30000.00, 5.00)
(370,"Denkan", "Anais", 95000.00, 1.50)
d) Add button “Previous Faculty” to skip through each previous element of Faculty 
hash map objects and displays faculty info within TextView widget as shown hereafter.
e) Add button “Calculated Bonus” to display total bonus of a given faculty into
TextView widget and within device screen layout using Toast class as shown hereafter in 
Figure.
f) Add new layout to FacultyMobileProject so mobile user will get that layout when she rotates 
her mobile device as shown in Figure above. Use FrameLayout and place buttons within 
appropriate layout.
g) Use Bundle class object to save current faculty element of hash map whenever 
mobile user chooses as orientation.
