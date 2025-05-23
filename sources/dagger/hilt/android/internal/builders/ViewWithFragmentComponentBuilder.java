package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.hilt.android.components.ViewWithFragmentComponent;

public interface ViewWithFragmentComponentBuilder {
    ViewWithFragmentComponent build();

    ViewWithFragmentComponentBuilder view(View view);
}
