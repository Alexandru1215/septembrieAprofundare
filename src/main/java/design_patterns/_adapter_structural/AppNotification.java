package design_patterns._adapter_structural;

import lombok.Builder;

@Builder
public class AppNotification implements NotifcationSenderAdapter {

   private final DependencyNotificationSenderAdapter dependencyNotificationSenderAdapter;

    public AppNotification(DependencyNotificationSenderAdapter dependencyNotificationSenderAdapter) {
        this.dependencyNotificationSenderAdapter = dependencyNotificationSenderAdapter;
    }


    @Override
    public void sendNotification() {
        dependencyNotificationSenderAdapter.send();
    }
}
