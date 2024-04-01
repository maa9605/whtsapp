package com.whatsapp.registration;

import X.AbstractActivityC454221y;
import X.AbstractC41791uW;
import X.AbstractC465527h;
import X.AbstractDialogC79813mG;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass008;
import X.AnonymousClass011;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass223;
import X.C000200d;
import X.C001200o;
import X.C002701i;
import X.C005002g;
import X.C00J;
import X.C011505r;
import X.C012005w;
import X.C018308n;
import X.C018708s;
import X.C018808t;
import X.C019208x;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C03510Fz;
import X.C04400Ka;
import X.C04510Kl;
import X.C04960Mq;
import X.C05E;
import X.C05Y;
import X.C06C;
import X.C06K;
import X.C0DK;
import X.C0DS;
import X.C0E7;
import X.C0EG;
import X.C0GA;
import X.C0HA;
import X.C0K1;
import X.C0KQ;
import X.C0L7;
import X.C0LF;
import X.C26S;
import X.C28E;
import X.C2AO;
import X.C2Aa;
import X.C2CO;
import X.C2CQ;
import X.C2DT;
import X.C2M0;
import X.C2M1;
import X.C2M2;
import X.C2M5;
import X.C2MB;
import X.C2MG;
import X.C2MI;
import X.C2MN;
import X.C2Oy;
import X.C2S3;
import X.C3VI;
import X.C40071rX;
import X.C40291rx;
import X.C40301ry;
import X.C41321tj;
import X.C41451tw;
import X.C41511u2;
import X.C41581uB;
import X.C42161vG;
import X.C42171vH;
import X.C42181vJ;
import X.C42701wB;
import X.C43981yK;
import X.C455822q;
import X.C456723a;
import X.C469829b;
import X.C47302Ar;
import X.C47682Ce;
import X.C48362Ey;
import X.C49622Lq;
import X.C49632Lr;
import X.C52652b6;
import X.C79753mA;
import X.DialogC79773mC;
import X.DialogC85983wb;
import X.InterfaceC002901k;
import X.InterfaceC09180cm;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.WaEditText;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.crop.CropImage;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.net.URISyntaxException;

/* loaded from: classes2.dex */
public class RegisterName extends AbstractActivityC454221y {
    public static C2S3 A1O;
    public long A00;
    public Bitmap A01;
    public Handler A02;
    public Handler A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public InterfaceC09180cm A07;
    public C012005w A08;
    public C02L A09;
    public C04960Mq A0A;
    public C005002g A0B;
    public WaEditText A0C;
    public C469829b A0D;
    public C06K A0E;
    public C0L7 A0F;
    public C0GA A0G;
    public AnonymousClass008 A0H;
    public C018708s A0I;
    public C011505r A0J;
    public C0LF A0K;
    public C41321tj A0L;
    public C0KQ A0M;
    public C41581uB A0N;
    public C0E7 A0O;
    public C02E A0P;
    public AnonymousClass012 A0Q;
    public C001200o A0R;
    public C02F A0S;
    public C0DK A0T;
    public C42171vH A0U;
    public C05E A0V;
    public C06C A0W;
    public C48362Ey A0X;
    public C47682Ce A0Y;
    public AnonymousClass223 A0Z;
    public C2MI A0a;
    public C49622Lq A0b;
    public C0HA A0c;
    public AnonymousClass011 A0d;
    public C49632Lr A0e;
    public C455822q A0f;
    public C41451tw A0g;
    public C018808t A0h;
    public C05Y A0i;
    public C40291rx A0j;
    public C41511u2 A0k;
    public C0EG A0l;
    public C40301ry A0m;
    public C47302Ar A0n;
    public C02O A0o;
    public C04400Ka A0p;
    public C456723a A0q;
    public C2Oy A0r;
    public C2AO A0s;
    public DialogC79773mC A0t;
    public C3VI A0u;
    public C2DT A0v;
    public C2Aa A0w;
    public RegistrationScrollView A0x;
    public AbstractDialogC79813mG A0y;
    public C2CQ A0z;
    public C42181vJ A10;
    public C42161vG A11;
    public C42701wB A12;
    public AbstractC41791uW A13;
    public C2M0 A14;
    public C2M1 A15;
    public C2MN A16;
    public C2CO A17;
    public C2M2 A18;
    public C26S A19;
    public C2M5 A1A;
    public AbstractC465527h A1B;
    public C2MG A1C;
    public C40071rX A1D;
    public C03510Fz A1E;
    public C2MB A1F;
    public InterfaceC002901k A1G;
    public C00J A1H;
    public Integer A1I;
    public Integer A1J;
    public Integer A1K;
    public boolean A1L;
    public boolean A1M;
    public final C79753mA A1N;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.3mA] */
    public RegisterName() {
        super(true);
        this.A0G = null;
        this.A02 = new Handler(Looper.getMainLooper()) { // from class: X.3VE
            {
                RegisterName.this = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                C2S3 c2s3 = RegisterName.A1O;
                if (c2s3 != null && c2s3.A03) {
                    if (c2s3.A04) {
                        DialogC79773mC dialogC79773mC = RegisterName.this.A0t;
                        if (dialogC79773mC != null) {
                            dialogC79773mC.A00(1);
                            return;
                        }
                        return;
                    }
                    RegisterName registerName = RegisterName.this;
                    C002701i.A18(registerName, 0);
                    int i = RegisterName.A1O.A00;
                    if (i == 1) {
                        C002701i.A19(registerName, 1);
                    } else if (i != 3) {
                    } else {
                        C002701i.A19(registerName, 109);
                    }
                }
            }
        };
        this.A03 = new Handler(Looper.getMainLooper()) { // from class: X.3VF
            {
                RegisterName.this = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                RegisterName.this.A1Y();
            }
        };
        this.A07 = new InterfaceC09180cm() { // from class: X.3m9
            {
                RegisterName.this = this;
            }

            @Override // X.InterfaceC09180cm
            public void AHj() {
                RegisterName.this.A0C.dispatchKeyEvent(new KeyEvent(0, 67));
            }

            @Override // X.InterfaceC09180cm
            public void AJi(int[] iArr) {
                C002701i.A1H(RegisterName.this.A0C, iArr, 25);
            }
        };
        this.A1N = new Object() { // from class: X.3mA
            {
                RegisterName.this = this;
            }
        };
    }

    public static void A00(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName("com.whatsapp", "com.whatsapp.Main");
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        Intent intent2 = new Intent();
        try {
            intent2.putExtra("android.intent.extra.shortcut.INTENT", Intent.parseUri(intent.toUri(0), 0));
        } catch (URISyntaxException e) {
            StringBuilder A0P = C000200d.A0P("registername/remove-shortcut cannot parse shortcut uri ");
            A0P.append(e.getMessage());
            Log.e(A0P.toString(), e);
        }
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.sendBroadcast(intent2);
    }

    public static void A01(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName("com.whatsapp", "com.whatsapp.Main");
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        Intent intent2 = new Intent();
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, R.mipmap.icon));
        intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.sendBroadcast(intent2);
    }

    @Override // X.C0DS
    public void A1P() {
        Me A04;
        if (getIntent().getExtras() != null && getIntent().getBooleanExtra("debug", false)) {
            C02L c02l = this.A09;
            c02l.A05();
            Me me = c02l.A00;
            if (me != null) {
                A04 = new Me(me.cc, me.number, ((ActivityC02290Ap) this).A0F.A0I());
            } else {
                throw null;
            }
        } else {
            A04 = this.A0w.A04();
        }
        if (A04.jabber_id == null) {
            Log.e("registername/messagestoreverified/missing-params bounce to regphone");
            this.A0w.A0B(1);
            A16(new Intent(this, RegisterPhone.class), true);
            return;
        }
        C02L c02l2 = this.A09;
        c02l2.A05();
        if (!c02l2.A08(A04, "me")) {
            finish();
            return;
        }
        C02L c02l3 = this.A09;
        c02l3.A05();
        c02l3.A06(A04);
        ProfilePhotoReminder.A00(((ActivityC02290Ap) this).A0F, this.A0B);
        Log.i("registername/set_dirty");
        this.A0j.A1Z = false;
        this.A0w.A08();
        this.A0j.A03();
        Log.i("regname/msgstoreverified/group_sync_required");
        ((C0DS) this).A0L.A0N(true, true, 3);
        this.A00 = SystemClock.uptimeMillis();
        C02L c02l4 = this.A09;
        c02l4.A05();
        C0K1 c0k1 = c02l4.A01;
        if (c0k1 != null) {
            this.A0W = c0k1;
            C04400Ka c04400Ka = this.A0p;
            C02L c02l5 = this.A09;
            c02l5.A05();
            c04400Ka.A02(c02l5.A03, 0, 2, null);
            if (((ActivityC02290Ap) this).A0F.A00.getLong("message_store_verified_time", 0L) == 0) {
                C000200d.A0h(((ActivityC02290Ap) this).A0F, "message_store_verified_time", System.currentTimeMillis());
            }
            A1Z();
            if (this.A0y != null) {
                if (this.A0V.A01() != 0) {
                    Log.i("registername/restoredialog/congrats");
                    this.A0y.A00(2);
                } else {
                    Log.i("registername/restoredialog/empty-msg-restore");
                    if (!this.A1M && this.A0D.A08()) {
                        A15(new Intent(this, GoogleDriveNewUserSetupActivity.class), 15);
                        this.A1M = true;
                    }
                    C002701i.A18(this, 103);
                }
            } else if (this.A0S.A02("android.permission.GET_ACCOUNTS") != 0) {
                Log.i("registername/delay google drive setup due to lack of permissions");
                ((ActivityC02290Ap) this).A0F.A0U(System.currentTimeMillis() + 604800000);
            }
            this.A1G.AS1(new RunnableEBaseShape5S0100000_I0_5(this, 30));
            return;
        }
        throw null;
    }

    @Override // X.C0DS
    public void A1T(boolean z) {
        ((C0DS) this).A01.A0A(z, true);
        AbstractDialogC79813mG abstractDialogC79813mG = this.A0y;
        if (abstractDialogC79813mG == null || !z) {
            return;
        }
        abstractDialogC79813mG.A00(1);
    }

    public void A1V() {
        ((C0DS) this).A09.A07(false);
        ((C0DS) this).A0G.A01();
        this.A0L.A04();
        A1P();
    }

    public void A1W() {
        Log.i("registername/start");
        Editable text = this.A0C.getText();
        if (text != null) {
            String A0t = C002701i.A0t(text.toString().trim());
            if (C43981yK.A0H(A0t, C52652b6.A01)) {
                Log.w("registername/checkmarks in pushname");
                AUh(PushnameEmojiBlacklistDialogFragment.A00(A0t));
                return;
            }
            if (A0t.length() == 0) {
                Log.w("registername/no-pushname");
                ((ActivityC02290Ap) this).A0A.A07(R.string.register_failure_noname, 0);
                return;
            }
            C2S3 c2s3 = A1O;
            if (c2s3 != null && !c2s3.A03) {
                return;
            }
            StringBuilder A0P = C000200d.A0P("registername/check-sinitializer, null?");
            A0P.append(c2s3 == null);
            Log.i(A0P.toString());
            C2S3 c2s32 = new C2S3(this.A17, this.A09, this.A0d, this.A0l, ((C0DS) this).A0I, ((C0DS) this).A02, ((C0DS) this).A04, this.A0I, ((ActivityC02310Ar) this).A01, this.A1A, this.A1E, ((C0DS) this).A0L, this.A0N, this.A0L, this.A0k, this.A0p, this.A0w, ((ActivityC02290Ap) this).A0F, this.A0A, this.A19, this.A0n, this.A13, ((C0DS) this).A0F, this.A0T, this.A0M, this.A1N, this.A02);
            A1O = c2s32;
            c2s32.A01 = this.A00;
            this.A1G.AS1(new RunnableEBaseShape0S1100000_I0(this, A0t, 22));
            C002701i.A19(this, 0);
            if (((CompoundButton) findViewById(R.id.cbx_app_shortcut)).isChecked()) {
                A01(this, getString(R.string.launcher_app_name));
            }
            View view = this.A05;
            if (view != null) {
                view.setVisibility(4);
            }
            C000200d.A0h(((ActivityC02290Ap) this).A0F, "com.whatsapp.registername.initializer_start_time", System.currentTimeMillis());
            this.A03.sendEmptyMessageDelayed(0, 600000L);
            return;
        }
        throw null;
    }

    public final void A1X() {
        if (!((C0DS) this).A0G.A01.A08(false)) {
            C42161vG c42161vG = this.A11;
            if (c42161vG.A01.A00.getBoolean("migrate_from_consumer_app_directly", false)) {
                c42161vG.A01();
            }
            String externalStorageState = Environment.getExternalStorageState();
            StringBuilder sb = new StringBuilder();
            sb.append("registername/clicked/sdcardstate ");
            sb.append(externalStorageState);
            Log.i(sb.toString());
            if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
                C002701i.A19(this, 107);
                return;
            }
            Log.i("registername/check-for-local-and-remote-backups");
            Intent intent = new Intent(this, RestoreFromBackupActivity.class);
            intent.setAction("action_show_restore_one_time_setup");
            startActivityForResult(intent, 14);
            return;
        }
        Log.i("registername/msgstore/healthy");
        A1V();
        ((ActivityC02290Ap) this).A0F.A0U(System.currentTimeMillis() + 604800000);
    }

    public final void A1Y() {
        View view;
        long j = ((ActivityC02290Ap) this).A0F.A00.getLong("com.whatsapp.registername.initializer_start_time", -1L);
        if (j <= 0 || System.currentTimeMillis() - j <= 600000 || (view = this.A05) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void A1Z() {
        Bitmap bitmap;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.registration_profile_photo_size);
        float dimension = getResources().getDimension(R.dimen.registration_profile_photo_radius);
        if (this.A0W != null) {
            C02L c02l = this.A09;
            c02l.A05();
            if (!C04510Kl.A00(c02l.A03)) {
                this.A06.setEnabled(true);
                this.A04.setVisibility(8);
                if (!this.A0J.A04(this.A0W).exists() || (bitmap = this.A0K.A02(this, this.A0W, dimensionPixelSize, dimension, false)) == null) {
                    if (this.A0F != null) {
                        bitmap = C0L7.A01(this, R.drawable.ic_reg_addphoto, dimensionPixelSize, dimension);
                    } else {
                        throw null;
                    }
                }
                this.A06.setImageBitmap(bitmap);
            }
        }
        this.A06.setEnabled(false);
        this.A04.setVisibility(0);
        bitmap = this.A01;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
            this.A01 = bitmap;
        }
        this.A06.setImageBitmap(bitmap);
    }

    public final void A1a(Integer num, Integer num2) {
        if (this.A0S.A06() && this.A1K.intValue() == 1) {
            this.A1K = num;
        }
        if (this.A0S.A03() && this.A1J.intValue() == 1) {
            this.A1J = num2;
        }
    }

    public void lambda$onCreate$1419$RegisterName(View view) {
        Log.i("registername/clicked");
        A1W();
    }

    public /* synthetic */ void lambda$onCreate$1423$RegisterName(View view) {
        this.A1L = true;
        this.A0q.A04(this, this.A0W, 12);
    }

    @Override // X.C0DS, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder("registername/activity-result request:");
        sb.append(i);
        sb.append(" result:");
        sb.append(i2);
        Log.i(sb.toString());
        switch (i) {
            case 12:
                if (i2 != -1) {
                    return;
                }
                if (intent != null && intent.getBooleanExtra("is_reset", false)) {
                    this.A0q.A06(this.A0W);
                    A1Z();
                    return;
                }
                this.A0q.A05(this, intent, 13, this);
                return;
            case 13:
                this.A0q.A03().delete();
                if (i2 == -1) {
                    if (!this.A0q.A09(this.A0W)) {
                        return;
                    }
                    A1Z();
                    return;
                } else if (i2 != 0 || intent == null) {
                    return;
                } else {
                    CropImage.A00(this.A0q.A02, intent, this);
                    return;
                }
            case 14:
                if (i2 == 3) {
                    Log.i("registername/activity-result backup (Google Drive or local) found and is being restored.");
                    Log.i("registername/msgstore-download-finished");
                    A1V();
                    AbstractDialogC79813mG abstractDialogC79813mG = this.A0y;
                    if (abstractDialogC79813mG != null) {
                        abstractDialogC79813mG.hide();
                    }
                    this.A1I = 3;
                } else if (i2 == 0) {
                    Log.i("registername/activity-result gdrive-activity canceled");
                    ((C0DS) this).A01.A08();
                } else if (i2 == 2) {
                    A1T(false);
                    this.A1I = 2;
                } else if (i2 == 1) {
                    A1T(false);
                    this.A1I = 1;
                } else {
                    StringBuilder sb2 = new StringBuilder("registername/activity-result unknown result code ");
                    sb2.append(i2);
                    sb2.append(" from RestoreFromBackupActivity.");
                    Log.e(sb2.toString());
                }
                A1a(4, 4);
                return;
            case 15:
                C002701i.A18(this, 103);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                if (i2 == 1) {
                    Log.i("registername/activity-result/successfully-restored");
                    String string = ((ActivityC02290Ap) this).A0F.A00.getString("push_name", "");
                    if (!TextUtils.isEmpty(string)) {
                        this.A0C.setText(string);
                        WaEditText waEditText = this.A0C;
                        waEditText.setSelection(waEditText.length());
                    }
                    A1V();
                } else if (i2 == 2) {
                    Log.i("registername/check-for-local-and-remote-backups");
                    Intent intent2 = new Intent(this, RestoreFromBackupActivity.class);
                    intent2.setAction("action_show_restore_one_time_setup");
                    startActivityForResult(intent2, 14);
                }
                this.A10.A01.A09 = Long.valueOf(SystemClock.elapsedRealtime() - ((ActivityC02290Ap) this).A0F.A00.getLong("direct_migration_start_time", -1L));
                return;
            case 17:
                A1a(3, 3);
                A1X();
                return;
            case 18:
                if (i2 == 2) {
                    A1T(false);
                    return;
                } else if (i2 != 1) {
                    return;
                } else {
                    A1V();
                    return;
                }
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C48362Ey c48362Ey = this.A0X;
        if (c48362Ey != null && c48362Ey.isShowing()) {
            this.A0X.dismiss();
        } else {
            C018308n.A03(this);
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        DialogC79773mC dialogC79773mC = this.A0t;
        if (dialogC79773mC != null) {
            dialogC79773mC.onCreate(dialogC79773mC.onSaveInstanceState());
            DialogC79773mC dialogC79773mC2 = this.A0t;
            dialogC79773mC2.A01.A05 = dialogC79773mC2.findViewById(R.id.pay_ed_contact_support);
            A1Y();
        }
        AbstractDialogC79813mG abstractDialogC79813mG = this.A0y;
        if (abstractDialogC79813mG != null) {
            abstractDialogC79813mG.onCreate(abstractDialogC79813mG.onSaveInstanceState());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0029, code lost:
        if (r31.getBoolean("started_gdrive_new_user_activity", false) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x027d, code lost:
        if (r7 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02a1, code lost:
        if (r7 != null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // X.AbstractActivityC454221y, X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.RegisterName.onCreate(android.os.Bundle):void");
    }

    @Override // X.C0DS, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        if (i == 0) {
            Log.i("registername/dialog/initprogress");
            if (A1O == null) {
                Log.w("registername/dialog/initprogress/init-null/remove");
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableEBaseShape5S0100000_I0_5(this, 31), 3L);
            }
            DialogC79773mC dialogC79773mC = new DialogC79773mC(this, ((ActivityC02310Ar) this).A01);
            this.A0t = dialogC79773mC;
            dialogC79773mC.setCancelable(false);
            return this.A0t;
        } else if (i == 1) {
            Log.w("registername/dialog/failed-net");
            C019208x c019208x = new C019208x(this);
            c019208x.A03(R.string.initialization_fail_title);
            c019208x.A01.A0E = getString(R.string.initialization_fail_message, getString(R.string.connectivity_self_help_instructions));
            c019208x.A06(R.string.initialization_fail_retry, new DialogInterface.OnClickListener() { // from class: X.3UO
                {
                    RegisterName.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    RegisterName registerName = RegisterName.this;
                    registerName.A1W();
                    C002701i.A18(registerName, 1);
                }
            });
            return c019208x.A00();
        } else if (i != 103) {
            if (i != 109) {
                return super.onCreateDialog(i);
            }
            Log.w("registername/dialog/cant-connect");
            return C28E.A05(this, this.A1G, this.A0P, this.A0h, this.A0O, this.A0S, this.A0v);
        } else {
            Log.i("registername/dialog/restore");
            DialogC85983wb dialogC85983wb = new DialogC85983wb(this, this, ((ActivityC02310Ar) this).A01, ((C0DS) this).A0E, this.A0V, this.A0w);
            this.A0y = dialogC85983wb;
            dialogC85983wb.setCancelable(false);
            this.A1G.AS1(new RunnableEBaseShape0S1100000_I0(this, (String) AnonymousClass029.A0U(((ActivityC02310Ar) this).A01, ((C0DS) this).A0E.A08()), 21));
            return this.A0y;
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.registration_help);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            this.A0m.A04();
        }
        C0GA c0ga = this.A0G;
        if (c0ga != null) {
            this.A0H.A00(c0ga);
            this.A0G = null;
        }
        this.A0u.A00();
        RegistrationScrollView registrationScrollView = this.A0x;
        if (registrationScrollView != null) {
            registrationScrollView.getViewTreeObserver().removeOnScrollChangedListener(registrationScrollView.A07);
            if (registrationScrollView.A02 != null) {
                registrationScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(registrationScrollView.A02);
            }
            this.A0x = null;
        }
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0z.A02("register-name");
            this.A0u.A01(this, this.A0z, "register-name");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0w.A0A();
            startActivity(EULA.A00(this));
            finishAffinity();
            return true;
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        Handler handler;
        super.onPause();
        C2S3 c2s3 = A1O;
        if (c2s3 == null || (handler = c2s3.A02) == null) {
            return;
        }
        handler.removeMessages(0);
        c2s3.A02 = null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (A1O != null) {
            C002701i.A19(this, 0);
            C2S3 c2s3 = A1O;
            Handler handler = this.A02;
            if (c2s3.A03) {
                handler.sendEmptyMessage(0);
            }
            c2s3.A02 = handler;
            A1Y();
        }
        if (super.A0Q.A02() && this.A0t == null) {
            C002701i.A19(this, 0);
            Log.i("registername/resume reg verified; explicitly display continue screen");
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("started_gdrive_new_user_activity", this.A1M);
    }
}
