package com.hsbc;

public class TestMethodsCall {

	public static void main(String[] args) {
		test((byte)50); // by default whole numbers are treated as int
		System.out.println("________________________");
		test(40, 50);
	}
	public static void test(byte b) { System.out.println("test(byte)"); }
	public static void test(short s) { System.out.println("test(short)"); }
	public static void test(int i) { System.out.println("test(int)"); }
	public static void test(long l) { System.out.println("test(long)"); }
	public static void test(float f) { System.out.println("test(float)"); }
	public static void test(double d) { System.out.println("test(double)"); }
	public static void test(int i, int j) {System.out.println("test(int, int)");}
	public static void test(int i, long l) {System.out.println("test(int, long)");}
	public static void test(int i, float f) {System.out.println("test(int, float)");}
	public static void test(int i, double d) {System.out.println("test(int, double)");}
}
/*
 * Auto-conversion happens from lower types to higher types
 * Explicit-conversion is required from higher types to lower types
 * byte -> short -> int -> long
 * byte -> short -> int -> float -> double
 */
