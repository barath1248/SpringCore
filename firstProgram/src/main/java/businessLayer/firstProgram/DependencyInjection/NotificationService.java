package businessLayer.firstProgram.DependencyInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class NotificationService {
	private List<String> notificationTypeService;
	private Set<String> serviceRegions;
	private Map<String, String> notificationProvider;
	private Properties basicConfProperties;

	public void setNotificationTypeService(List<String> notificationTypeService) {
		this.notificationTypeService = notificationTypeService;
	}

	public void setServiceRegions(Set<String> serviceRegions) {
		this.serviceRegions = serviceRegions;
	}

	public void setNotificationProvider(Map<String, String> notificationProvider) {
		this.notificationProvider = notificationProvider;
	}

	public void setBasicConfProperties(Properties basicConfProperties) {
		this.basicConfProperties = basicConfProperties;
	}
	

	public List<String> getNotificationTypeService() {
		return notificationTypeService;
	}

	public Set<String> getServiceRegions() {
		return serviceRegions;
	}

	public Map<String, String> getNotificationProvider() {
		return notificationProvider;
	}

	public Properties getBasicConfProperties() {
		return basicConfProperties;
	}

	@Override
	public String toString() {
		return "NotificationService [notificationTypeService=" + notificationTypeService + ", serviceRegions="
				+ serviceRegions + ", notificationProvider=" + notificationProvider + ", basicConfProperties="
				+ basicConfProperties + "]";
	}

}
