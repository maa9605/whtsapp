package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.0SD */
/* loaded from: classes.dex */
public class C0SD extends FrameLayout {
    public final C31791cx A00;

    public C0SD(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.A00 = new C31791cx(this, context, googleMapOptions);
        setClickable(true);
    }

    public final void A00() {
        C31791cx c31791cx = this.A00;
        AnonymousClass166 anonymousClass166 = ((AnonymousClass165) c31791cx).A01;
        if (anonymousClass166 != null) {
            try {
                ((C31781cw) anonymousClass166).A02.onDestroy();
                return;
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        c31791cx.A00(1);
    }

    public final void A01() {
        AnonymousClass166 anonymousClass166 = ((AnonymousClass165) this.A00).A01;
        if (anonymousClass166 != null) {
            try {
                ((C31781cw) anonymousClass166).A02.onLowMemory();
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
    }

    public final void A02() {
        C31791cx c31791cx = this.A00;
        AnonymousClass166 anonymousClass166 = ((AnonymousClass165) c31791cx).A01;
        if (anonymousClass166 != null) {
            try {
                ((C31781cw) anonymousClass166).A02.AMk();
                return;
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        c31791cx.A00(5);
    }

    public final void A03() {
        final C31791cx c31791cx = this.A00;
        c31791cx.A01(null, new AnonymousClass164() { // from class: X.1c3
            @Override // X.AnonymousClass164
            public final int ADF() {
                return 5;
            }

            @Override // X.AnonymousClass164
            public final void AWP(AnonymousClass166 anonymousClass166) {
                C31781cw c31781cw = (C31781cw) c31791cx.A01;
                if (c31781cw == null) {
                    throw null;
                }
                try {
                    c31781cw.A02.AOH();
                } catch (RemoteException e) {
                    throw new C09Y(e);
                }
            }
        });
    }

    public final void A04(final Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            final C31791cx c31791cx = this.A00;
            c31791cx.A01(bundle, new AnonymousClass164() { // from class: X.1c2
                @Override // X.AnonymousClass164
                public final int ADF() {
                    return 1;
                }

                @Override // X.AnonymousClass164
                public final void AWP(AnonymousClass166 anonymousClass166) {
                    AnonymousClass166 anonymousClass1662 = c31791cx.A01;
                    Bundle bundle2 = bundle;
                    C31781cw c31781cw = (C31781cw) anonymousClass1662;
                    if (c31781cw == null) {
                        throw null;
                    }
                    try {
                        Bundle bundle3 = new Bundle();
                        C18W.A01(bundle2, bundle3);
                        IMapViewDelegate iMapViewDelegate = c31781cw.A02;
                        iMapViewDelegate.AJ4(bundle3);
                        C18W.A01(bundle3, bundle2);
                        c31781cw.A00 = (View) BinderC06190Rw.A00(iMapViewDelegate.ADt());
                        ViewGroup viewGroup = c31781cw.A01;
                        viewGroup.removeAllViews();
                        viewGroup.addView(c31781cw.A00);
                    } catch (RemoteException e) {
                        throw new C09Y(e);
                    }
                }
            });
            if (((AnonymousClass165) c31791cx).A01 == null) {
                C06210Ry c06210Ry = C06210Ry.A00;
                final Context context = getContext();
                int A00 = c06210Ry.A00(context);
                String A02 = C230214x.A02(context, A00);
                String A01 = C230214x.A01(context, A00);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(A02);
                linearLayout.addView(textView);
                final Intent A012 = c06210Ry.A01(context, A00, null);
                if (A012 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(A01);
                    linearLayout.addView(button);
                    button.setOnClickListener(new View.OnClickListener() { // from class: X.168
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            try {
                                context.startActivity(A012);
                            } catch (ActivityNotFoundException e) {
                                Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                            }
                        }
                    });
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void A05(Bundle bundle) {
        C31791cx c31791cx = this.A00;
        AnonymousClass166 anonymousClass166 = ((AnonymousClass165) c31791cx).A01;
        if (anonymousClass166 != null) {
            C31781cw c31781cw = (C31781cw) anonymousClass166;
            try {
                Bundle bundle2 = new Bundle();
                C18W.A01(bundle, bundle2);
                c31781cw.A02.AOJ(bundle2);
                C18W.A01(bundle2, bundle);
                return;
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        Bundle bundle3 = ((AnonymousClass165) c31791cx).A00;
        if (bundle3 != null) {
            bundle.putAll(bundle3);
        }
    }

    public void A06(C18L c18l) {
        C07K.A1S("getMapAsync() must be called on the main thread");
        C31791cx c31791cx = this.A00;
        AnonymousClass166 anonymousClass166 = ((AnonymousClass165) c31791cx).A01;
        if (anonymousClass166 != null) {
            try {
                ((C31781cw) anonymousClass166).A02.AB3(new C1r0(c18l));
                return;
            } catch (RemoteException e) {
                throw new C09Y(e);
            }
        }
        c31791cx.A04.add(c18l);
    }
}
