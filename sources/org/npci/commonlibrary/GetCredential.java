package org.npci.commonlibrary;

import X.C002301c;
import X.C4B9;
import X.C4BK;
import X.C4GH;
import X.C4JI;
import X.C90404Aw;
import X.RunnableC75213eX;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.commonlibrary.GetCredential;

/* loaded from: classes3.dex */
public class GetCredential extends C4JI {
    public int A00;
    public TransitionDrawable A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public C002301c A05;
    public C90404Aw A0A;
    public C4B9 A0B;
    public boolean A0E;
    public JSONObject A08 = null;
    public JSONObject A09 = null;
    public JSONArray A06 = null;
    public JSONArray A07 = new JSONArray();
    public NPCIFragment A0C = null;
    public final Context A0F = this;
    public boolean A0D = false;

    public static final void A00(float f, float f2, View view) {
        RotateAnimation rotateAnimation = new RotateAnimation(f, f2, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(300);
        rotateAnimation.setFillEnabled(true);
        rotateAnimation.setFillAfter(true);
        view.startAnimation(rotateAnimation);
    }

    public /* synthetic */ void A0o() {
        this.A0D = false;
    }

    public /* synthetic */ void A0p(int i) {
        NPCIFragment nPCIFragment;
        dispatchKeyEvent(new KeyEvent(0, i));
        if (i == 66 && (nPCIFragment = this.A0C) != null) {
            if (!(nPCIFragment instanceof PinFragment)) {
                ATMPinFragment aTMPinFragment = (ATMPinFragment) nPCIFragment;
                int i2 = aTMPinFragment.A00;
                if (i2 == 0) {
                    ((C4BK) ((NPCIFragment) aTMPinFragment).A0C.get(1)).A7v();
                    aTMPinFragment.A00++;
                    return;
                }
                if (i2 == 1) {
                    ArrayList arrayList = ((NPCIFragment) aTMPinFragment).A0C;
                    if (((C4GH) arrayList.get(0)).A00 != ((C4BK) arrayList.get(0)).getInputValue().length()) {
                        aTMPinFragment.A10((View) arrayList.get(0), ((NPCIFragment) aTMPinFragment).A0B.A06(R.string.npci_otp_title));
                        return;
                    } else if (((C4GH) arrayList.get(1)).A00 != ((C4BK) arrayList.get(1)).getInputValue().length()) {
                        aTMPinFragment.A10((View) arrayList.get(1), ((NPCIFragment) aTMPinFragment).A0B.A06(R.string.npci_atm_title));
                        return;
                    } else {
                        ViewSwitcher viewSwitcher = aTMPinFragment.A01;
                        if (viewSwitcher != null) {
                            viewSwitcher.showNext();
                            aTMPinFragment.A00 = 2;
                            return;
                        }
                    }
                }
                int i3 = aTMPinFragment.A00;
                if (i3 == 2) {
                    if (!((C4BK) ((NPCIFragment) aTMPinFragment).A0C.get(i3)).A7v()) {
                        return;
                    }
                    aTMPinFragment.A12();
                    return;
                }
                aTMPinFragment.A12();
                return;
            }
            PinFragment pinFragment = (PinFragment) nPCIFragment;
            int i4 = pinFragment.A00;
            ArrayList arrayList2 = ((NPCIFragment) pinFragment).A0C;
            if (i4 < arrayList2.size() - 1) {
                if (!((C4BK) arrayList2.get(i4 + 1)).A7v()) {
                    return;
                }
                int i5 = pinFragment.A00 + 1;
                pinFragment.A00 = i5;
                if (i5 < arrayList2.size() - 1) {
                    return;
                }
                pinFragment.A12();
                return;
            }
            pinFragment.A12();
        }
    }

    public final void A0q(final boolean z) {
        ImageView imageView = this.A04;
        if (z) {
            A00(0.0f, 180.0f, imageView);
        } else {
            A00(180.0f, 0.0f, imageView);
        }
        final int height = this.A02.getHeight();
        if (height == 0) {
            height = this.A00;
        }
        this.A02.clearAnimation();
        this.A02.animate().y(z ? 0.0f : height * (-1.0f)).alpha(z ? 1.0f : 0.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: X.4B8
            {
                GetCredential.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (z) {
                    return;
                }
                GetCredential getCredential = GetCredential.this;
                getCredential.A02.setVisibility(8);
                getCredential.A03.setVisibility(8);
                getCredential.A01.resetTransition();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                if (z) {
                    GetCredential getCredential = GetCredential.this;
                    getCredential.A01.startTransition(300);
                    getCredential.A02.setVisibility(0);
                    getCredential.A03.setVisibility(0);
                    if (getCredential.A02.getY() == 0.0f) {
                        getCredential.A02.setY(-height);
                        return;
                    }
                    return;
                }
                GetCredential.this.A01.reverseTransition(300);
            }
        });
    }

    public /* synthetic */ boolean A0r(View view, MotionEvent motionEvent) {
        view.performClick();
        if (view.getId() == R.id.transaction_details_scroller && motionEvent.getAction() == 1 && this.A02.getVisibility() == 0) {
            A0q(false);
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean A0s(View view, MotionEvent motionEvent) {
        view.performClick();
        if (motionEvent.getAction() == 1 && this.A02.getVisibility() == 0) {
            A0q(false);
            return true;
        }
        return false;
    }

    public void lambda$onCreate$190$GetCredential(View view) {
        setResult(this.A0E ? 251 : 252, new Intent());
        finish();
    }

    public /* synthetic */ void lambda$renderTransactionBar$193$GetCredential(View view) {
        A0q(!(this.A02.getVisibility() == 0));
    }

    @Override // X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A0D) {
            setResult(this.A0E ? 251 : 252, new Intent());
            super.onBackPressed();
            return;
        }
        this.A0D = true;
        Toast.makeText(this, this.A05.A06(R.string.npci_back_button_exit_message), 0).show();
        new Handler().postDelayed(new RunnableC75213eX(this), 2000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:363:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x02f4 A[LOOP:0: B:368:0x02ec->B:370:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x04d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C4JI, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.GetCredential.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            C4B9 c4b9 = this.A0B;
            if (c4b9 != null) {
                unregisterReceiver(c4b9);
                this.A0B = null;
            }
        } catch (Throwable unused) {
            Log.e("PAY: Failed to unregister SMS receiver (Ignoring)");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4B9] */
    @Override // X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (checkCallingOrSelfPermission("android.permission.RECEIVE_SMS") == 0) {
            this.A0B = new BroadcastReceiver() { // from class: X.4B9
                {
                    GetCredential.this = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:122:0x0124, code lost:
                    continue;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:129:0x011b, code lost:
                    continue;
                 */
                @Override // android.content.BroadcastReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onReceive(android.content.Context r17, android.content.Intent r18) {
                    /*
                        Method dump skipped, instructions count: 298
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4B9.onReceive(android.content.Context, android.content.Intent):void");
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            try {
                intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
                intentFilter.setPriority(Integer.MAX_VALUE);
                registerReceiver(this.A0B, intentFilter);
                return;
            } catch (Throwable unused) {
                Log.e("PAY: Failed to register SMS broadcast receiver (Ignoring)");
                return;
            }
        }
        Log.e("PAY: RECEIVE_SMS permission not provided by the App. This will affect Auto OTP detection feature of Common Library");
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("has_error", this.A0E);
    }
}
