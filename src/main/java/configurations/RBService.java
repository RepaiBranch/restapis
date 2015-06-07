package configurations;
 
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.jdbi.DBIFactory;  

import controller.RBServiceExecController;
import model.SqlQueries;

import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.sqlobject.Bind;

public class RBService extends Service<RBConfiguration>{

	public static void main(String[] args) throws Exception {
	        new RBService().run(args);
	    }
	
	@Override
	public void initialize(Bootstrap<RBConfiguration> arg0) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void run(RBConfiguration configuration, Environment environment) throws Exception {
	     
		final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDatabaseConfiguration(), "mysql");
        final SqlQueries dao = jdbi.onDemand(SqlQueries.class);
        environment.addResource(new RBServiceExecController(dao));		
	}

}
