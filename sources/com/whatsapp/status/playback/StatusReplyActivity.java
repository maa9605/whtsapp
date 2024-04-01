package com.whatsapp.status.playback;

import X.C2EQ;
import X.C2Q7;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.status.playback.StatusReplyActivity;

/* loaded from: classes2.dex */
public class StatusReplyActivity extends C2Q7 {
    public C2EQ A00;
    public final Rect A01 = new Rect();
    public final Runnable A03 = new RunnableEBaseShape6S0100000_I0_6(this, 34);
    public final ViewTreeObserver.OnGlobalLayoutListener A02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3XP
        {
            StatusReplyActivity.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i;
            int identifier;
            C48352Ex c48352Ex;
            StatusReplyActivity statusReplyActivity = StatusReplyActivity.this;
            View view = ((MessageReplyActivity) statusReplyActivity).A02;
            Rect rect = statusReplyActivity.A01;
            view.getWindowVisibleDisplayFrame(rect);
            int[] iArr = new int[2];
            ((MessageReplyActivity) statusReplyActivity).A02.getLocationOnScreen(iArr);
            int measuredHeight = rect.bottom - ((MessageReplyActivity) statusReplyActivity).A01.getMeasuredHeight();
            if (!C2MB.A00(((MessageReplyActivity) statusReplyActivity).A02) && (c48352Ex = statusReplyActivity.A0a) != null && c48352Ex.isShowing()) {
                i = ((C0R7) statusReplyActivity.A0a).A01;
            } else {
                i = 0;
            }
            int i2 = (measuredHeight - i) - iArr[1];
            if (C0K7.A05() && (identifier = statusReplyActivity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
                i2 -= statusReplyActivity.getResources().getDimensionPixelSize(identifier);
            }
            View view2 = ((MessageReplyActivity) statusReplyActivity).A01;
            C0AT.A0T(view2, i2 - view2.getTop());
            View view3 = ((MessageReplyActivity) statusReplyActivity).A02;
            Runnable runnable = statusReplyActivity.A03;
            view3.removeCallbacks(runnable);
            ((MessageReplyActivity) statusReplyActivity).A02.postDelayed(runnable, statusReplyActivity.getResources().getInteger(17694722));
        }
    };

    @Override // X.C2Q7, com.whatsapp.status.playback.MessageReplyActivity, X.AbstractActivityC50122Py, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().setFlags(1024, 1024);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().setFlags(134217728, 134217728);
            getWindow().setFlags(67108864, 67108864);
        }
        super.onCreate(bundle);
        View view = ((MessageReplyActivity) this).A02;
        if (view == null) {
            return;
        }
        view.setSystemUiVisibility(4);
        ((MessageReplyActivity) this).A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    @Override // com.whatsapp.status.playback.MessageReplyActivity, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        View view = ((MessageReplyActivity) this).A02;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this.A02);
            ((MessageReplyActivity) this).A02.removeCallbacks(this.A03);
        }
    }
}
