package configurations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.config.Configuration;
import com.yammer.dropwizard.db.DatabaseConfiguration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public  class RBConfiguration extends Configuration
{
	
	 @Valid
     @NotNull
     @JsonProperty
     private DatabaseConfiguration database = new DatabaseConfiguration();

     public DatabaseConfiguration getDatabaseConfiguration() {
        return database;
     }

}
