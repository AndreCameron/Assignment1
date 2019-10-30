package house;

public class Photo {
	private int length;
	private int width;
	
	public Photo()
	{
		this(0, 0);
	}
	
		public Photo(int l, int w) {
		length = l;
		width = w;
		}
		
		public int getLength() {
		return length;
		}
		public void setLength(int l) {
		length = l;
		}
		public int getWidth() {
		return width;
		}
		public void setWidth(int w) {
		width = w;
		}
		
		@Override
		public String toString() {
		return "Photo [Length=" + length + ", width=" + width + "]";
		}
			
	}
