package edu.orangecoastcollege.cs272.ic14.model;

public class VideoGame {
	
	private int mId;
	private String mName;
	private String mPlatform;
	private int mYear;
	private String mGenre;
	private String mPublisher;
	
	public VideoGame(int id, String name, String platform, int year, String genre, String publisher) {
		super();
		mId = id;
		mName = name;
		mPlatform = platform;
		mYear = year;
		mGenre = genre;
		mPublisher = publisher;
	}

	public String getName() {
		return mName;
	}

	public void setName(String name) {
		mName = name;
	}

	public String getPlatform() {
		return mPlatform;
	}

	public void setPlatform(String platform) {
		mPlatform = platform;
	}

	public int getYear() {
		return mYear;
	}

	public void setYear(int year) {
		mYear = year;
	}

	public String getGenre() {
		return mGenre;
	}

	public void setGenre(String genre) {
		mGenre = genre;
	}

	public String getPublisher() {
		return mPublisher;
	}

	public void setPublisher(String publisher) {
		mPublisher = publisher;
	}

	public int getId() {
		return mId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mGenre == null) ? 0 : mGenre.hashCode());
		result = prime * result + mId;
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((mPlatform == null) ? 0 : mPlatform.hashCode());
		result = prime * result + ((mPublisher == null) ? 0 : mPublisher.hashCode());
		result = prime * result + mYear;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoGame other = (VideoGame) obj;
		if (mGenre == null) {
			if (other.mGenre != null)
				return false;
		} else if (!mGenre.equals(other.mGenre))
			return false;
		if (mId != other.mId)
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (mPlatform == null) {
			if (other.mPlatform != null)
				return false;
		} else if (!mPlatform.equals(other.mPlatform))
			return false;
		if (mPublisher == null) {
			if (other.mPublisher != null)
				return false;
		} else if (!mPublisher.equals(other.mPublisher))
			return false;
		if (mYear != other.mYear)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VideoGame [Id=" + mId + ", Name=" + mName + ", Platform=" + mPlatform + ", Year=" + mYear
				+ ", Genre=" + mGenre + ", Publisher=" + mPublisher + "]";
	}
	
	

}
