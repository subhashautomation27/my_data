package com.HyBird;
public class RatesOfInterest implements SBI,PNB{
	public void SBI() {
		Interest1();}
	public void PNB() {
		Interst();}
    public float Interest1() {
		return 8.5f;}
    public float Interst() {
     	return 9.0f;}
public static void main(String[] args) {
		RatesOfInterest obj=new RatesOfInterest();
		obj.SBI();
		System.out.println("rateofinterest for sbi:" + obj.Interest1() + "%"  );
		obj.PNB();
		System.out.println("rateofinterest for sbi:" + obj.Interst() + "%" );}}