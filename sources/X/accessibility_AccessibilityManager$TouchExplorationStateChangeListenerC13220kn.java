package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0kn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC13220kn implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final InterfaceC13210km A00;

    public accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC13220kn(InterfaceC13210km interfaceC13210km) {
        this.A00 = interfaceC13210km;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC13220kn) {
            return this.A00.equals(((accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC13220kn) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        C09290cz.setClickableOrFocusableBasedOnAccessibility(((C32781eh) this.A00).A00, z);
    }
}
