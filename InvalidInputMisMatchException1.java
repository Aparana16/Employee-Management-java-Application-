package com.employee;

public class InvalidInputMisMatchException1 extends Exception{
		InvalidInputMisMatchException1(){
			super("ID already exist");
		}
		InvalidInputMisMatchException1(String message){
			super("SORRY :(  Already exist this Employee ID ,  :) please Enter right Employee ID");
		}

}
