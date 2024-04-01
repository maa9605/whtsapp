package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0Nv */
/* loaded from: classes.dex */
public class C05230Nv {
    public final C02L A00;
    public final C02F A01;
    public final C000500h A02;
    public final C002301c A03;
    public final C02O A04;
    public final InterfaceC002901k A05;
    public final boolean A06 = true;

    public C05230Nv(C02L c02l, InterfaceC002901k interfaceC002901k, C002301c c002301c, C02F c02f, C000500h c000500h, C02O c02o) {
        this.A00 = c02l;
        this.A05 = interfaceC002901k;
        this.A03 = c002301c;
        this.A01 = c02f;
        this.A02 = c000500h;
        this.A04 = c02o;
    }

    public static final byte A00(String str) {
        if (str.equals("vnd.android.cursor.item/name")) {
            return (byte) 0;
        }
        if (str.equals("vnd.android.cursor.item/phone_v2")) {
            return (byte) 1;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.whatsapp.profile")) {
            return (byte) 2;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.whatsapp.voip.call")) {
            return (byte) 3;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.whatsapp.video.call")) {
            return (byte) 4;
        }
        throw new IllegalStateException(C000200d.A0H("no code found for ", str));
    }

    public static final boolean A01(C06C c06c) {
        return (c06c == null || c06c.A08 == null || !c06c.A0X || c06c.A0C() || c06c.A0D() || (c06c.A02() instanceof C08060aX)) ? false : true;
    }

    public static final boolean A02(ArrayList arrayList, ContentResolver contentResolver, String str) {
        boolean z;
        try {
            try {
                contentResolver.applyBatch("com.android.contacts", arrayList);
                z = true;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("androidcontactssync/");
                sb.append(str);
                Log.e(sb.toString(), e);
                z = false;
            }
            return z;
        } finally {
            arrayList.clear();
        }
    }

    public final Account A03(Context context) {
        Account account;
        AccountManager accountManager = AccountManager.get(context);
        Account[] accountsByType = accountManager.getAccountsByType("com.whatsapp");
        if (accountsByType.length == 0) {
            account = A04(context, accountManager);
            if (account == null) {
                return null;
            }
        } else {
            account = accountsByType[0];
            if (!TextUtils.equals(context.getString(R.string.app_name), account.name)) {
                accountManager.removeAccount(account, null, null);
                account = A04(context, accountManager);
                if (account == null) {
                    return null;
                }
            }
        }
        try {
            if (!ContentResolver.getSyncAutomatically(account, "com.android.contacts")) {
                ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
            }
            ContentResolver.addPeriodicSync(account, "com.android.contacts", new Bundle(), 3600L);
            return account;
        } catch (NullPointerException e) {
            if (e.getMessage() == null || !e.getMessage().startsWith("Attempt to invoke virtual method 'com.prism.gaia")) {
                throw e;
            }
            return account;
        }
    }

    public final Account A04(Context context, AccountManager accountManager) {
        C02L c02l = this.A00;
        c02l.A05();
        if (c02l.A03 == null) {
            Log.e("androidcontactssync/get-or-create-account null jid");
            return null;
        }
        Account account = new Account(context.getString(R.string.app_name), "com.whatsapp");
        if (accountManager.addAccountExplicitly(account, null, null)) {
            ContentResolver.setIsSyncable(account, "com.android.contacts", 1);
            return account;
        }
        Log.e("androidcontactssync/get-or-create-account failed to add account");
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:543:0x03f1
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public synchronized java.util.List A05(android.content.Context r37, java.util.Set r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 3717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05230Nv.A05(android.content.Context, java.util.Set, java.util.List):java.util.List");
    }

    public final synchronized void A06(Context context, Account account) {
        Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", account.name).appendQueryParameter("account_type", account.type).appendQueryParameter("caller_is_syncadapter", "true").build();
        Uri build2 = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(build, new String[]{"_id", "sync1", "sync2", "display_name"}, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                UserJid nullable = UserJid.getNullable(query.getString(1));
                if (nullable != null) {
                    arrayList.add(new C27101Lz(query.getLong(0), nullable, query.getString(3)));
                }
            }
            query.close();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C27101Lz c27101Lz = (C27101Lz) it.next();
            if (arrayList2.size() >= 100) {
                A02(arrayList2, context.getContentResolver(), "error updating contact data action strings");
            }
            C002301c c002301c = this.A03;
            String A0F = c002301c.A0F(C04630Le.A03(c27101Lz.A01.user));
            String valueOf = String.valueOf(c27101Lz.A00);
            arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.profile"}).withValue("data3", c002301c.A0D(R.string.account_sync_message_detail_format, A0F)).withYieldAllowed(true).build());
            arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"}).withValue("data3", c002301c.A0D(R.string.account_sync_voip_call_detail_format, A0F)).build());
            if (this.A06) {
                arrayList2.add(ContentProviderOperation.newUpdate(build2).withSelection("raw_contact_id=? and mimetype=?", new String[]{valueOf, "vnd.android.cursor.item/vnd.com.whatsapp.video.call"}).withValue("data3", c002301c.A0D(R.string.account_sync_video_call_detail_format, A0F)).build());
            }
        }
        if (!arrayList2.isEmpty()) {
            A02(arrayList2, context.getContentResolver(), "error updating contact data action strings");
        }
    }

    public synchronized boolean A07(Context context) {
        if (!this.A01.A03()) {
            Log.w("androidcontactssync/clearsyncdata/permission_denied");
            return true;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", context.getString(R.string.app_name)).appendQueryParameter("account_type", "com.whatsapp").appendQueryParameter("caller_is_syncadapter", "true").build();
        Log.i("androidcontactssync/clearsyncdata/delete");
        try {
            contentResolver.delete(build, "account_name = ? AND account_type = ?", new String[]{context.getString(R.string.app_name), "com.whatsapp"});
            return true;
        } catch (SecurityException e) {
            if (e.getMessage() == null || !e.getMessage().startsWith("User 0 tying to get authenticator types for ")) {
                throw e;
            }
            return false;
        }
    }
}
