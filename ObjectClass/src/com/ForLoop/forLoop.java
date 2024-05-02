package com.ForLoop;


	public class forLoop {
		private int id;

		public forLoop() {
			// TODO Auto-generated constructor stub
		}

		public forLoop(int id) {

			this.id = id;
			System.out.println(id);
		}

		@Override
		protected void finalize() throws Throwable {
			System.out.println("finalize method is invoked");
		}
		public static void main(String[] args) {
			for(int i=0;i<=100000;i++) {
				System.out.println(i);
				
			}
			}
//			String s1="FB";
//			String s2="E";
//			System.out.println(s1.hashCode());
//			System.out.println(s2.hashCode());
//			System.out.println(s1.equals(s2));
			
		}

	

