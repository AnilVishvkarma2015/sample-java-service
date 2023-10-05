package sample;

public class Sample {

	public static void main(String ar[]) {
		System.out.println("This is the sample Java servcie to demo the Git commands!");
		pushCommand();
		pullCommand();
	}

	public static void pushCommand() {
		System.out.println("git push origin branch is the command");
	}

	public static void pullCommand() {
		System.out.println("git pull origin branch is the command");
	}
}
