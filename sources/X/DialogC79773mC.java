package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.3mC  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogC79773mC extends C09K {
    public int A00;
    public final /* synthetic */ RegisterName A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC79773mC(RegisterName registerName, C002301c c002301c) {
        super(registerName, c002301c, R.layout.initialise_new_user, true);
        this.A01 = registerName;
        this.A00 = 0;
    }

    public void A00(int i) {
        byte[] bArr;
        C000200d.A0q("registername/updatestate/state ", i);
        this.A00 = i;
        if (i != 1) {
            RegisterName registerName = this.A01;
            if (!((C0DS) registerName).A0Q.A02()) {
                registerName.A12.A03();
                findViewById(R.id.initial_sync_progress).setVisibility(0);
                findViewById(R.id.photo_progress).setVisibility(0);
                return;
            }
        }
        findViewById(R.id.initial_sync_progress).setVisibility(4);
        findViewById(R.id.photo_progress).setVisibility(4);
        RegisterName registerName2 = this.A01;
        ((ActivityC02290Ap) registerName2).A0F.A0D().remove("com.whatsapp.registername.initializer_start_time").apply();
        View view = registerName2.A05;
        if (view != null) {
            view.setVisibility(4);
        }
        registerName2.A03.removeMessages(0);
        Log.i("registername/sync/finished");
        registerName2.startActivity(new Intent(registerName2, Main.class));
        registerName2.finish();
        RegisterName.A1O = null;
        C002701i.A18(registerName2, 0);
        if (registerName2.A10 != null) {
            if (((ActivityC02290Ap) registerName2).A0F.A00.getLong("eula_accepted_time", 0L) > 0) {
                C37451mR c37451mR = new C37451mR();
                c37451mR.A07 = Long.valueOf(System.currentTimeMillis() - ((ActivityC02290Ap) registerName2).A0F.A00.getLong("eula_accepted_time", 0L));
                c37451mR.A08 = Long.valueOf(System.currentTimeMillis() - ((ActivityC02290Ap) registerName2).A0F.A00.getLong("message_store_verified_time", 0L));
                c37451mR.A00 = Boolean.valueOf(((ActivityC02290Ap) registerName2).A0F.A00.getBoolean("registration_attempt_skip_with_no_vertical", false));
                c37451mR.A03 = Boolean.valueOf(((ActivityC02290Ap) registerName2).A0F.A00.getBoolean("registration_retry_fetching_biz_profile", false));
                c37451mR.A06 = registerName2.A1K;
                c37451mR.A04 = registerName2.A1J;
                c37451mR.A05 = registerName2.A1I;
                c37451mR.A02 = Boolean.valueOf(registerName2.A1L);
                C06C c06c = registerName2.A0W;
                if (c06c != null) {
                    c37451mR.A01 = Boolean.valueOf(registerName2.A0J.A04(c06c).exists());
                }
                String A0G = ((ActivityC02290Ap) registerName2).A0F.A0G();
                try {
                    UUID fromString = UUID.fromString(A0G);
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    allocate.putLong(fromString.getMostSignificantBits());
                    allocate.putLong(fromString.getLeastSignificantBits());
                    bArr = allocate.array();
                } catch (IllegalArgumentException unused) {
                    C000200d.A13("RegistrationUtils/getBytesFromUUIDString/invalid-input ", A0G);
                    bArr = new byte[0];
                }
                c37451mR.A09 = Base64.encodeToString(bArr, 11);
                registerName2.A0d.A0B(c37451mR, null, true);
                registerName2.A0d.A03();
                registerName2.A1G.AS1(new RunnableEBaseShape9S0100000_I1_1(this, 12));
            }
            ((ActivityC02290Ap) registerName2).A0F.A0D().remove("message_store_verified_time").remove("eula_accepted_time").remove("registration_retry_fetching_biz_profile").remove("registration_attempt_skip_with_no_vertical").remove("registration_sibling_app_phone_number").remove("registration_sibling_app_country_code").remove("registration_sibling_app_min_storage_needed").remove("sister_app_content_provider_is_enabled").remove("direct_migration_start_time").remove("direct_db_migration_timeout_in_secs").remove("migrate_from_consumer_app_directly").remove("direct_migration_session_id").apply();
            return;
        }
        throw null;
    }

    @Override // X.C09K, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFormat(1);
        getWindow().addFlags(4096);
        getWindow().setSoftInputMode(3);
        A00(bundle == null ? 0 : bundle.getInt("state"));
        RegisterName registerName = this.A01;
        View findViewById = findViewById(R.id.pay_ed_contact_support);
        registerName.A05 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(this, 11));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(C02160Ac.A00(getContext(), R.color.registration_status_bar));
            getWindow().setNavigationBarColor(C02160Ac.A00(getContext(), R.color.black));
        }
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
