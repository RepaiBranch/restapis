package model;

public class SqlQueries {

	// How do we use this class?
	// This class is exclusively to make define all the queries that we'd be making against the MySql db
	// When we add other kind of databases (mongo for instance), we'll have to figure out what to do.
	
	/*
	 @SqlUpdate("insert into tb_accesspoints(bssid, ssid, capabilities) values (:bssid, :ssid, :capabilities)")
	    void insertAP(@Bind("bssid") String bssid, @Bind("ssid") String ssid, @Bind("capabilities") String capabilities);

	    @SqlQuery("select id from tb_accesspoints where bssid = :bssid")
	    int findNameById(@Bind("bssid") String bssid);
	    
	    @Mapper(RSMSLogMapper.class)
	    @SqlQuery("select * from tb_rsmslog where userMobile = :userMobile and date > :date;")
	    List<RCallLog> getSmsLogs(@Bind("userMobile") String userMobile, @Bind("date") Date date); */

}
