package dagger.hilt.android.lifecycle;

public interface RetainedLifecycle {

    public interface OnClearedListener {
        void onCleared();
    }

    void addOnClearedListener(OnClearedListener onClearedListener);

    void removeOnClearedListener(OnClearedListener onClearedListener);
}
