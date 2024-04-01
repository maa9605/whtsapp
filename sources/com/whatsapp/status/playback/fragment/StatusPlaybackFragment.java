package com.whatsapp.status.playback.fragment;

import X.AbstractC53812hY;
import X.AbstractC53822hZ;
import X.C71703Xd;
import android.content.res.Configuration;
import android.graphics.Rect;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractMap;

/* loaded from: classes2.dex */
public abstract class StatusPlaybackFragment extends Hilt_StatusPlaybackFragment {
    public boolean A00;
    public final Rect A01 = new Rect();

    @Override // X.C0BA
    public void A0f() {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onPause ");
        sb.append(this);
        Log.i(sb.toString());
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onDestroy ");
        sb.append(this);
        Log.i(sb.toString());
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onResume ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public String A0y() {
        UserJid userJid = ((StatusPlaybackContactFragment) this).A0K;
        if (userJid != null) {
            return userJid.getRawString();
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
        if (r4.A0T != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0z() {
        /*
            r5 = this;
            r4 = r5
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            X.06F r0 = r4.A0V
            java.util.Map r0 = r0.A06()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r3 = r0.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r2 = r3.next()
            X.2hZ r2 = (X.AbstractC53822hZ) r2
            boolean r0 = r4.A07
            if (r0 != 0) goto L28
            boolean r1 = r4.A0T
            r0 = 0
            if (r1 == 0) goto L29
        L28:
            r0 = 1
        L29:
            r2.A02 = r0
            X.2hY r2 = (X.AbstractC53812hY) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L35
            r2.A0F()
            goto L13
        L35:
            r2.A0G()
            goto L13
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackFragment.A0z():void");
    }

    public void A10() {
        this.A00 = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onViewActive ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A11() {
        this.A00 = false;
        StringBuilder sb = new StringBuilder("playbackFragment/onViewInactive ");
        sb.append(this);
        Log.i(sb.toString());
    }

    public void A12(int i) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this;
        if (statusPlaybackContactFragment.A0S == null) {
            statusPlaybackContactFragment.A01 = i;
            return;
        }
        C71703Xd c71703Xd = statusPlaybackContactFragment.A0a;
        AbstractC53822hZ A17 = statusPlaybackContactFragment.A17();
        if (c71703Xd != null) {
            if (A17 == null || A17.A05) {
                return;
            }
            AbstractC53812hY abstractC53812hY = (AbstractC53812hY) A17;
            ((AbstractC53822hZ) abstractC53812hY).A05 = true;
            abstractC53812hY.A0M(i, abstractC53812hY.A06);
            return;
        }
        throw null;
    }

    public void A13(Rect rect) {
        if (!(this instanceof StatusPlaybackBaseFragment)) {
            this.A01.set(rect);
            return;
        }
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) this;
        Rect rect2 = ((StatusPlaybackFragment) statusPlaybackBaseFragment).A01;
        rect2.set(rect);
        statusPlaybackBaseFragment.A15(rect);
        for (AbstractC53822hZ abstractC53822hZ : ((AbstractMap) ((StatusPlaybackContactFragment) statusPlaybackBaseFragment).A0V.A06()).values()) {
            abstractC53822hZ.A08(rect2);
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        StringBuilder sb = new StringBuilder("playbackFragment/onConfigurationChanged ");
        sb.append(this);
        Log.i(sb.toString());
    }
}
