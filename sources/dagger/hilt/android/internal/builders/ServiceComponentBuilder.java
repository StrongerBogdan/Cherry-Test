package dagger.hilt.android.internal.builders;

import android.app.Service;
import dagger.hilt.android.components.ServiceComponent;

public interface ServiceComponentBuilder {
    ServiceComponent build();

    ServiceComponentBuilder service(Service service);
}
