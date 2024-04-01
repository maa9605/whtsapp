package com.whatsapp.stickers;

import X.ActivityC02330At;
import X.AnonymousClass011;
import X.C000200d;
import X.C002301c;
import X.C018508q;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.C0HS;
import X.C25R;
import X.C2AS;
import X.C2Bk;
import X.C2Q9;
import X.C47512Bn;
import X.C82523qe;
import X.C82533qf;
import X.InterfaceC002901k;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class AddThirdPartyStickerPackActivity extends C2Q9 {
    public AnonymousClass011 A00;
    public C82533qf A01;
    public C47512Bn A02;
    public InterfaceC002901k A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0HS, X.3qf] */
    @Override // X.C2Q9, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_authority");
        String stringExtra3 = getIntent().getStringExtra("sticker_pack_name");
        String packageName = getCallingActivity() != null ? getCallingActivity().getPackageName() : null;
        if (packageName != null) {
            ProviderInfo resolveContentProvider = getPackageManager().resolveContentProvider(stringExtra2, 128);
            if (resolveContentProvider == null) {
                String A0H = C000200d.A0H("cannot find the provider for authority:", stringExtra2);
                Intent intent = new Intent();
                intent.putExtra("validation_error", A0H);
                setResult(0, intent);
                Log.e(A0H);
                finish();
                overridePendingTransition(0, 0);
                return;
            } else if (!packageName.equals(resolveContentProvider.packageName)) {
                String A0J = C000200d.A0J("the calling activity: ", packageName, " does not own authority: ", stringExtra2);
                Intent intent2 = new Intent();
                intent2.putExtra("validation_error", A0J);
                setResult(0, intent2);
                Log.e(A0J);
                finish();
                overridePendingTransition(0, 0);
                return;
            }
        }
        ?? r3 = new C0HS(this.A00, this.A02, stringExtra, stringExtra2, stringExtra3, this) { // from class: X.3qf
            public AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;
            public final AnonymousClass011 A01;
            public final C47512Bn A02;
            public final String A03;
            public final String A04;
            public final String A05;
            public final WeakReference A06;

            {
                this.A01 = r2;
                this.A04 = stringExtra;
                this.A03 = stringExtra2;
                this.A05 = stringExtra3;
                this.A02 = r3;
                this.A06 = new WeakReference(this);
            }

            @Override // X.C0HS
            public void A06() {
                ActivityC02330At activityC02330At = (ActivityC02330At) this.A06.get();
                if (activityC02330At != null) {
                    String str = this.A04;
                    String str2 = this.A03;
                    String str3 = this.A05;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("sticker_pack_id", str);
                    bundle2.putString("sticker_pack_authority", str2);
                    bundle2.putString("sticker_pack_name", str3);
                    AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = new AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment();
                    addStickerPackDialogFragment.A0P(bundle2);
                    this.A00 = addStickerPackDialogFragment;
                    addStickerPackDialogFragment.A14(activityC02330At.A0N(), "add");
                }
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                String str = this.A04;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = this.A03;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.A05)) {
                        C37591mf c37591mf = new C37591mf();
                        try {
                            C47512Bn c47512Bn = this.A02;
                            C42531vt A01 = c47512Bn.A01(str2, str);
                            if (c47512Bn.A07.A03(str2, str)) {
                                return new C71923Xz(0, null);
                            }
                            c37591mf.A00 = Boolean.valueOf(A01.A0M);
                            c37591mf.A02 = Long.valueOf(A01.A04.size());
                            c37591mf.A03 = Long.valueOf((A01.A01 / 10) / 1024);
                            c37591mf.A01 = Boolean.TRUE;
                            this.A01.A0B(c37591mf, null, false);
                            return new C71923Xz(1, null);
                        } catch (Exception e) {
                            Log.e("AddThirdPartyStickerPackActivity/fetch sticker pack error:", e);
                            c37591mf.A01 = Boolean.FALSE;
                            this.A01.A0B(c37591mf, null, false);
                            return new C71923Xz(2, e.getMessage());
                        }
                    }
                }
                StringBuilder A0P = C000200d.A0P("one of the follow fields are empty. pack id:");
                A0P.append(str);
                A0P.append(",authority:");
                A0P.append(this.A03);
                A0P.append(",sticker pack name:");
                A0P.append(this.A05);
                return new C71923Xz(2, A0P.toString());
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                C71923Xz c71923Xz = (C71923Xz) obj;
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
                if (addStickerPackDialogFragment != null && !addStickerPackDialogFragment.A0W) {
                    int i = c71923Xz.A00;
                    if (i == 0) {
                        C002301c c002301c = addStickerPackDialogFragment.A01;
                        addStickerPackDialogFragment.A18(c002301c.A0D(R.string.sticker_third_party_pack_added_already_with_app, addStickerPackDialogFragment.A06, c002301c.A06(R.string.localized_app_name)), 8, 0, 8);
                        Activity activity = (Activity) this.A06.get();
                        if (activity != null) {
                            Intent intent3 = new Intent();
                            intent3.putExtra("already_added", true);
                            activity.setResult(-1, intent3);
                        }
                    } else if (i == 1) {
                        C002301c c002301c2 = addStickerPackDialogFragment.A01;
                        addStickerPackDialogFragment.A18(c002301c2.A0D(R.string.add_third_party_sticker_pack_with_app, addStickerPackDialogFragment.A06, c002301c2.A06(R.string.localized_app_name)), 8, 8, 0);
                    } else if (i != 2) {
                    } else {
                        C002301c c002301c3 = addStickerPackDialogFragment.A01;
                        addStickerPackDialogFragment.A18(c002301c3.A0D(R.string.sticker_third_party_pack_invalid_with_app, c002301c3.A06(R.string.localized_app_name)), 8, 0, 8);
                        Activity activity2 = (Activity) this.A06.get();
                        if (activity2 == null) {
                            return;
                        }
                        Intent intent4 = new Intent();
                        intent4.putExtra("validation_error", c71923Xz.A01);
                        activity2.setResult(0, intent4);
                    }
                }
            }
        };
        this.A01 = r3;
        this.A03.ARy(r3, new Void[0]);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C82533qf c82533qf = this.A01;
        if (c82533qf == null || c82533qf.A04()) {
            return;
        }
        A05(true);
    }

    /* loaded from: classes2.dex */
    public class AddStickerPackDialogFragment extends Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment {
        public C018508q A00;
        public C002301c A01;
        public C2Bk A02;
        public C2AS A03;
        public String A04;
        public String A05;
        public String A06;
        public final C25R A09 = new C82523qe(this);
        public final View.OnClickListener A07 = new ViewOnClickEBaseShape5S0100000_I0_5(this, 29);
        public final View.OnClickListener A08 = new ViewOnClickEBaseShape5S0100000_I0_5(this, 25);

        @Override // X.C0BA
        public void A0q() {
            this.A0U = true;
            this.A02.A00(this.A09);
        }

        @Override // androidx.fragment.app.DialogFragment, X.C0BA
        public void A0v(Bundle bundle) {
            super.A0v(bundle);
            this.A02.A01(this.A09);
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            super.A0z(bundle);
            Bundle bundle2 = ((C0BA) this).A06;
            if (bundle2 != null) {
                this.A05 = bundle2.getString("sticker_pack_id");
                this.A04 = bundle2.getString("sticker_pack_authority");
                this.A06 = bundle2.getString("sticker_pack_name");
            }
            View inflate = LayoutInflater.from(((Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) this).A00).inflate(R.layout.add_third_party_sticker_dialog, (ViewGroup) null);
            C002301c c002301c = this.A01;
            ((TextView) inflate.findViewById(R.id.message_text_view)).setText(c002301c.A0D(R.string.validate_sticker_progress_message_with_app, c002301c.A06(R.string.localized_app_name)));
            View findViewById = inflate.findViewById(R.id.ok_button);
            findViewById.setVisibility(8);
            View.OnClickListener onClickListener = this.A08;
            findViewById.setOnClickListener(onClickListener);
            View findViewById2 = inflate.findViewById(R.id.cancel_button);
            findViewById2.setVisibility(8);
            findViewById2.setOnClickListener(onClickListener);
            View findViewById3 = inflate.findViewById(R.id.add_button);
            findViewById3.setOnClickListener(this.A07);
            findViewById3.setVisibility(8);
            C019208x c019208x = new C019208x(((Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) this).A00);
            C019308y c019308y = c019208x.A01;
            c019308y.A0C = inflate;
            c019308y.A01 = 0;
            return c019208x.A00();
        }

        public final void A18(String str, int i, int i2, int i3) {
            Dialog dialog = ((DialogFragment) this).A03;
            if (dialog != null) {
                ((TextView) dialog.findViewById(R.id.message_text_view)).setText(Html.fromHtml(str));
                dialog.findViewById(R.id.progress_bar).setVisibility(i);
                dialog.findViewById(R.id.ok_button).setVisibility(i2);
                dialog.findViewById(R.id.cancel_button).setVisibility(i3);
                dialog.findViewById(R.id.add_button).setVisibility(i3);
            }
        }

        @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (!((DialogFragment) this).A0C) {
                A16(true, true);
            }
            ActivityC02330At A09 = A09();
            if (A09 != null) {
                A09.finish();
                A09.overridePendingTransition(0, 0);
            }
        }
    }
}
