package com.my.compay.swagger.api;
import java.io.File;

@javax.annotation.Generated(value = "class com.my.compay.codegen.MyCodegenGenerator", date = "2016-06-28T11:12:52.731-04:00")
@Service("PluginApiServiceImpl") // Service bean to be used in the FactoryBean
public class PluginApiServiceImpl implements AnalyticApiService {

	private final Logger LOGGER = LoggerFactory.getLogger(PluginApiServiceImpl.class);

	// Temporary HashMaps for storing Plugins and Files
	private HashMap<String, Plugin> catalog = new HashMap<String, Plugin>();
	private HashMap<String, File> pluginJarRepo = new HashMap<String, File>();
	private HashMap<String, File> pluginConfigRepo = new HashMap<String, File>();

	/**
	 * Create a new Plugin and store the associated information in the catalog
	 * and repositories
	 */
	@Override
	public Response createPlugin(String json, InputStream jarInputStream, FormDataContentDisposition jarFileDetail,
			InputStream configInputStream, FormDataContentDisposition configFileDetail, SecurityContext securityContext)
					throws NotFoundException {
		Plugin plugin;

		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK,
				"Plugin " + "TBD" + " has been added")).build();
	}


	@Override
	public String getPluginApi() {
		// return a string for testing purposes
		return "Plugin API initialized";
	}

}
