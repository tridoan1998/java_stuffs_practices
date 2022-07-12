# Description:
Java Socket Programming that can be implemented over LAN devices using IP addresses. We also implementing GUI application. 

## Background knowledges:
Socket programming means to have two applications to talk to each other using built in classes such as Socket. There are two ways Socket can be done: either through TCP or UDP. TCP is when users need to send data with all the datas transfer to the client side, and this takes longer time to travel. While UDP, the data are fast with transfer but some of the data can be lost during when travel.

### Step by Step walk through and taking note of the process:
1. Creating a Login class extends JFrame.
2. putting JButton, JPanel, JTextField as static variables outside of constructor.
3. Creating the ActionListener for those buttons above to bascially making those buttons active. 
4. Creating the application form page for the application, follow similar logic as creating the login (SignupOne.java). Challenge to have problem with JCalendar as the compiler does not understand how it works. Solving this problem by making the JCalendar to input users date of birth, insteads d JTextField.

### Note:
1. if we want to add action to the buttons and stuffs. We will have to implements ActionListener at the beginning of the class, add a method named `public void actionPerformed(ActionEvent e)`, after implemented buttons, type `button.addActionListener(this);`



