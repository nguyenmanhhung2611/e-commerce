package utils;

public class ENUM {

	public enum Color {
		BLACK("BLACK"),
		YELLOW("YELLOW");
		
		private String color;
		
		Color(String color) {
			this.color = color;
		}
		
		public String get( ) {
			return this.color;
		}
	}
	
	public enum Storage {
		_32GB("32GB"),
		_64GB("64GB"),
		_128GB("128GB");
		
		private String storage;
		
		Storage(String storage) {
			this.storage = storage;
		}
		
		public String get( ) {
			return this.storage;
		}
	}
	
}
