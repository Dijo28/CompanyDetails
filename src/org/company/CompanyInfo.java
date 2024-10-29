package org.company;

public class CompanyInfo {
private void companyName() {
	System.out.println("Company name is HP");
}
private void companyId() {
	System.out.println("Company ID is 1231");
}
private void companyAddress() {
	System.out.println("Company is located in California");
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}
}
