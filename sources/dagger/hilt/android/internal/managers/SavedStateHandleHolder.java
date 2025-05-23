package dagger.hilt.android.internal.managers;

import Cm3UOe0P3gzeR8ADJg4EKIsI.FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
import Cm3UOe0P3gzeR8ADJg4EKIsI.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1;
import android.os.Bundle;
import androidx.lifecycle.asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja;
import androidx.lifecycle.cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;

public final class SavedStateHandleHolder {
    private FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK extras;
    private cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2 handle;
    private final boolean nonComponentActivity;

    public SavedStateHandleHolder(FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
        this.nonComponentActivity = fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK == null;
        this.extras = fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
    }

    public void clear() {
        this.extras = null;
    }

    public cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2 getSavedStateHandle() {
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(!this.nonComponentActivity, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2 cea3c8vslsvxwujclf4f9n3gm28voelpoxpuefreu9s1mkvk7prpvmse3qgsdlhamyk9j0ytqs8eayu732m3saphwpxkim6psffn95qy86rvvlfubqzeggqc44rddxl9gycmpmebwpmzremcrcwiicb2 = this.handle;
        if (cea3c8vslsvxwujclf4f9n3gm28voelpoxpuefreu9s1mkvk7prpvmse3qgsdlhamyk9j0ytqs8eayu732m3saphwpxkim6psffn95qy86rvvlfubqzeggqc44rddxl9gycmpmebwpmzremcrcwiicb2 != null) {
            return cea3c8vslsvxwujclf4f9n3gm28voelpoxpuefreu9s1mkvk7prpvmse3qgsdlhamyk9j0ytqs8eayu732m3saphwpxkim6psffn95qy86rvvlfubqzeggqc44rddxl9gycmpmebwpmzremcrcwiicb2;
        }
        Preconditions.checkNotNull(this.extras, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1 = new pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1(this.extras);
        pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.YmFIHVAy6MFnHbke10dLWI57IXCp(asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja.DrqQ8C7rtVRDTSclHGsDImq, Bundle.EMPTY);
        this.extras = pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1;
        cEa3c8vSLSVxwUJcLf4f9n3Gm28VoElpOXpuEFrEU9s1mKvk7PRPvMsE3QGsDlHAMYk9j0YTqs8eAYU732M3SapHWpxkiM6pSFFn95qy86rVVLfUBQZEGGQc44RdDXl9GYcMpMebwPmZReMcrcWIIcb2 VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU = asQX8JK5HmDXPcoA9YxLn7cpuBp3KP6Kb3odxWwo12KJ5d8EadSLwry1kNCpB2BMyI1q8ppamvM7V8TMZX0u4yLfB75z4Zfx44zbxotyq8ZtBder4E2Ym1q0028YzDwhrBpztS4K5wnrw39ja.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1);
        this.handle = VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
        this.extras = null;
        return VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU;
    }

    public boolean isInvalid() {
        return this.handle == null && this.extras == null;
    }

    public void setExtras(FGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK) {
        if (this.handle == null) {
            this.extras = fGrvCTY9aqtjVPkeckAZZbvRrR6Fir62RvUi5CYJVOsGK;
        }
    }
}
