package com.whatsapp;

import X.AbstractActivityC06920Vr;
import X.AbstractC005302j;
import X.AbstractC02800Cx;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.C002701i;
import X.C005002g;
import X.C018608r;
import X.C02160Ac;
import X.C02820Cz;
import X.C02L;
import X.C03010Du;
import X.C03860Hk;
import X.C04310Jr;
import X.C05920Qu;
import X.C0DD;
import X.C0DS;
import X.C0MO;
import X.C0U0;
import X.C1Lh;
import X.C2ME;
import X.C54552iw;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.List;

/* loaded from: classes.dex */
public class ContactPicker extends AbstractActivityC06920Vr implements C2ME, C0MO {
    public C005002g A00;
    public C03010Du A01;
    public C018608r A02;
    public BaseSharedPreviewDialogFragment A03;
    public C54552iw A04;
    public ContactPickerFragment A05;
    public WhatsAppLibLoader A06;

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1E(i);
        }
    }

    @Override // X.C0DS
    public void A1P() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A15();
        }
    }

    @Override // X.C0DS
    public void A1R(C03860Hk c03860Hk) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A13();
        }
    }

    public ContactPickerFragment A1V() {
        return new ContactPickerFragment();
    }

    @Override // X.C0MO
    public C54552iw AAX() {
        C54552iw c54552iw = this.A04;
        if (c54552iw == null) {
            C54552iw c54552iw2 = new C54552iw(this);
            this.A04 = c54552iw2;
            return c54552iw2;
        }
        return c54552iw;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APM(C0U0 c0u0) {
        super.APM(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.AnonymousClass091
    public void APN(C0U0 c0u0) {
        super.APN(c0u0);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.C2ME
    public void ARU() {
        this.A03 = null;
    }

    @Override // X.C2ME
    public void ASV(Uri uri, List list, Bundle bundle) {
        Intent A01;
        this.A01.A08(list, uri, C0DD.A0K(((ActivityC02290Ap) this).A0E.A07(), uri), null, AAX(), false);
        AAX().A00.A1L(list);
        if (list.size() == 1) {
            A01 = Conversation.A02(this, (AbstractC005302j) list.get(0));
            C002701i.A1C(A01, "ContactPicker:getPostSendIntent", ((ActivityC02270An) this).A08);
        } else {
            A01 = HomeActivity.A01(this);
        }
        startActivity(A01);
        finish();
    }

    @Override // X.C2ME
    public void ASa(String str, List list, Bundle bundle) {
        C05920Qu c05920Qu;
        Intent A01;
        Boolean valueOf = Boolean.valueOf(bundle.getBoolean("load_preview"));
        if (valueOf != null) {
            if (valueOf.booleanValue()) {
                c05920Qu = C1Lh.A00(C04310Jr.A01(str));
            } else {
                c05920Qu = null;
            }
            Boolean valueOf2 = Boolean.valueOf(bundle.getBoolean("has_text_from_url"));
            if (valueOf2 != null) {
                this.A02.A0d(list, str, c05920Qu, null, null, false, valueOf2.booleanValue());
                AAX().A00.A1L(list);
                if (list.size() == 1) {
                    A01 = Conversation.A02(this, (AbstractC005302j) list.get(0));
                    C002701i.A1C(A01, "ContactPicker:getPostSendIntent", ((ActivityC02270An) this).A08);
                } else {
                    A01 = HomeActivity.A01(this);
                }
                startActivity(A01);
                finish();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C2ME
    public void ATt(BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment) {
        this.A03 = baseSharedPreviewDialogFragment;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null || !contactPickerFragment.A1Y()) {
            super.onBackPressed();
        }
    }

    @Override // X.AbstractActivityC06920Vr, X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A06.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        C02L c02l = ((C0DS) this).A00;
        c02l.A05();
        if (c02l.A00 != null && this.A0Q.A02()) {
            if (C005002g.A01()) {
                Log.w("contactpicker/device-not-supported");
                AUh(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
            }
            if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                setTitle(R.string.conversation_shortcut);
            }
            setContentView(R.layout.contact_picker_activity);
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            }
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) A0N().A0Q.A01("ContactPickerFragment");
            this.A05 = contactPickerFragment;
            if (contactPickerFragment == null) {
                ContactPickerFragment A1V = A1V();
                this.A05 = A1V;
                Intent intent = getIntent();
                if (A1V != null) {
                    Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
                    if (intent.hasExtra("android.intent.extra.shortcut.ID")) {
                        extras.putString("jid", intent.getStringExtra("android.intent.extra.shortcut.ID"));
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("action", intent.getAction());
                    bundle2.putString("type", intent.getType());
                    bundle2.putBundle("extras", extras);
                    A1V.A0P(bundle2);
                    AbstractC02800Cx A0N = A0N();
                    if (A0N != null) {
                        C02820Cz c02820Cz = new C02820Cz(A0N);
                        c02820Cz.A09(R.id.fragment, this.A05, "ContactPickerFragment", 1);
                        if (!c02820Cz.A0D) {
                            c02820Cz.A0E = false;
                            c02820Cz.A02.A0h(c02820Cz, false);
                            return;
                        }
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    throw null;
                }
                throw null;
            }
            return;
        }
        ((ActivityC02290Ap) this).A0A.A07(R.string.finish_registration_first, 1);
        startActivity(new Intent(this, Main.class));
        finish();
    }

    @Override // X.C0DS, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A0y;
        ContactPickerFragment contactPickerFragment = this.A05;
        return (contactPickerFragment == null || (A0y = contactPickerFragment.A0y(i)) == null) ? super.onCreateDialog(i) : A0y;
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A03;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A16(false, false);
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A05;
            if (contactPickerFragment != null && contactPickerFragment.A1Y()) {
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A16();
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A16();
            return true;
        }
        return false;
    }
}
