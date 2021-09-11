import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class XMenComic {
	private int issueNum;
	private String title="";
	private String publishDate;
	public XMenComic(String line)
	{
		String[] arr=line.split("\\s");
		String[] last=line.split("	");
		publishDate=last[last.length-1];
		String[] p=publishDate.split(" ");
		issueNum=Integer.parseInt(arr[0]);
		ArrayList<String> titles=new ArrayList<>();
		for(String x:arr)
		{
			titles.add(x);
		}
		for(String y:p)
		{
			if(titles.contains(y))
			{
				titles.remove(y);
			}
		}
		if(titles.contains(issueNum+""))
		{
			titles.remove(issueNum+"");
		}
		
		java.util.Iterator<String> b= titles.iterator();
		while(b.hasNext())
		{
			title+=b.next()+" ";
		}
	}
	public int getIssueNum() {
		return issueNum;
	}
	public void setIssueNum(int issueNum) {
		this.issueNum = issueNum;
	}
	@Override
	public String toString() {
		return "XMenComic [issueNum=" + issueNum + ", title=" + title + ", publishDate=" + publishDate + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	

}
