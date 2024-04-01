package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.StatusConfirmMuteDialogFragment;
import com.whatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.3XX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3XX extends ViewOnClickEmptyBase implements View.OnClickListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final C11300hW A03;
    public final StatusPlaybackBaseFragment A04;
    public final int[] A05 = new int[2];
    public final int[] A06 = new int[2];
    public final ViewTreeObserver.OnGlobalLayoutListener A02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3XW
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C3XX c3xx = C3XX.this;
            View view = c3xx.A01;
            int[] iArr = c3xx.A05;
            view.getLocationOnScreen(iArr);
            int[] iArr2 = c3xx.A06;
            int i = iArr2[0];
            int i2 = iArr[0];
            if (i != i2 || iArr2[1] != iArr[1]) {
                iArr2[0] = i2;
                iArr2[1] = iArr[1];
                C11300hW c11300hW = c3xx.A03;
                c11300hW.A03.A01();
                c11300hW.A00();
                if (c3xx.A00 == null) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        c3xx.A00 = viewTreeObserver;
                        viewTreeObserver.addOnGlobalLayoutListener(c3xx.A02);
                    } else {
                        throw null;
                    }
                }
                StatusPlaybackBaseFragment statusPlaybackBaseFragment = c3xx.A04;
                if (1 != 0) {
                    statusPlaybackBaseFragment.A07 = true;
                    statusPlaybackBaseFragment.A0z();
                    return;
                }
                statusPlaybackBaseFragment.A07 = false;
                C018508q c018508q = statusPlaybackBaseFragment.A00;
                c018508q.A02.postDelayed(new RunnableEBaseShape6S0100000_I0_6(statusPlaybackBaseFragment, 35), 200L);
            }
        }
    };

    public C3XX(Context context, View view, C002301c c002301c, StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A03 = new C11300hW(context, view, c002301c.A0M() ? 5 : 3, R.attr.actionOverflowMenuStyle);
        this.A01 = view;
        this.A04 = statusPlaybackBaseFragment;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.A00 == null) {
            ViewTreeObserver viewTreeObserver = this.A01.getViewTreeObserver();
            this.A00 = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(this.A02);
        }
        View view2 = this.A01;
        int[] iArr = this.A05;
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = this.A06;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        C11300hW c11300hW = this.A03;
        C06650Uk c06650Uk = c11300hW.A02;
        c06650Uk.clear();
        final StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A04;
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackBaseFragment;
        if (statusPlaybackContactFragment.A0M.A07(statusPlaybackContactFragment.A0K).A0G) {
            c06650Uk.add(0, R.id.menuitem_conversations_unmute, 0, R.string.unmute_status);
        } else {
            c06650Uk.add(0, R.id.menuitem_conversations_mute, 0, R.string.mute_status);
        }
        c11300hW.A00 = new InterfaceC11280hU() { // from class: X.3q5
            @Override // X.InterfaceC11280hU
            public final void AJS(C11300hW c11300hW2) {
                C3XX c3xx = C3XX.this;
                ViewTreeObserver viewTreeObserver2 = c3xx.A00;
                if (viewTreeObserver2 != null) {
                    if (viewTreeObserver2.isAlive()) {
                        c3xx.A00.removeGlobalOnLayoutListener(c3xx.A02);
                    }
                    c3xx.A00 = null;
                }
                StatusPlaybackBaseFragment statusPlaybackBaseFragment2 = c3xx.A04;
                if (0 != 0) {
                    statusPlaybackBaseFragment2.A07 = true;
                    statusPlaybackBaseFragment2.A0z();
                    return;
                }
                statusPlaybackBaseFragment2.A07 = false;
                C018508q c018508q = statusPlaybackBaseFragment2.A00;
                c018508q.A02.postDelayed(new RunnableEBaseShape6S0100000_I0_6(statusPlaybackBaseFragment2, 35), 200L);
            }
        };
        c11300hW.A01 = new InterfaceC11290hV() { // from class: X.3q4
            @Override // X.InterfaceC11290hV
            public final boolean onMenuItemClick(MenuItem menuItem) {
                StatusPlaybackContactFragment statusPlaybackContactFragment2 = (StatusPlaybackContactFragment) StatusPlaybackBaseFragment.this;
                if (statusPlaybackContactFragment2.A09() == null) {
                    return false;
                }
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menuitem_conversations_unmute) {
                    UserJid userJid = statusPlaybackContactFragment2.A0K;
                    StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = new StatusConfirmUnmuteDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("jid", userJid.getRawString());
                    statusConfirmUnmuteDialogFragment.A0P(bundle);
                    C09360d8.A00(statusPlaybackContactFragment2, statusConfirmUnmuteDialogFragment);
                    return true;
                } else if (itemId != R.id.menuitem_conversations_mute) {
                    return true;
                } else {
                    UserJid userJid2 = statusPlaybackContactFragment2.A0K;
                    StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = new StatusConfirmMuteDialogFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("jid", userJid2.getRawString());
                    statusConfirmMuteDialogFragment.A0P(bundle2);
                    C09360d8.A00(statusPlaybackContactFragment2, statusConfirmMuteDialogFragment);
                    return true;
                }
            }
        };
        c11300hW.A00();
        if (1 != 0) {
            statusPlaybackBaseFragment.A07 = true;
            statusPlaybackBaseFragment.A0z();
            return;
        }
        statusPlaybackBaseFragment.A07 = false;
        C018508q c018508q = statusPlaybackBaseFragment.A00;
        c018508q.A02.postDelayed(new RunnableEBaseShape6S0100000_I0_6(statusPlaybackBaseFragment, 35), 200L);
    }
}
