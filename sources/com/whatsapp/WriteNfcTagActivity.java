package com.whatsapp;

import X.ActivityC02290Ap;
import X.C0H9;
import X.C0U1;
import X.C0WH;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class WriteNfcTagActivity extends C0WH {
    public PendingIntent A00;
    public NfcAdapter A01;
    public C0H9 A02;
    public String A03;
    public String A04;

    @Override // X.C0WH, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.write_nfc_tag);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0L(true);
            TextView textView = new TextView(this);
            textView.setGravity(17);
            textView.setText(R.string.approach_nfc_tag);
            setContentView(textView);
            this.A04 = getIntent().getStringExtra("mime");
            this.A03 = getIntent().getStringExtra("data");
            this.A01 = NfcAdapter.getDefaultAdapter(this);
            this.A00 = PendingIntent.getActivity(this, 0, new Intent(this, WriteNfcTagActivity.class).addFlags(536870912), 0);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onNewIntent(Intent intent) {
        Ndef ndef;
        super.onNewIntent(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction())) {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord((short) 2, this.A04.getBytes(Charset.forName("US-ASCII")), null, this.A03.getBytes(Charset.forName("US-ASCII")))});
            int length = ndefMessage.toByteArray().length;
            try {
                ndef = Ndef.get(tag);
            } catch (Exception e) {
                Log.e("writetag/failure/", e);
            }
            if (ndef != null) {
                ndef.connect();
                if (!ndef.isWritable()) {
                    Log.e("writetag/failure/tag not writable");
                } else if (ndef.getMaxSize() < length) {
                    Log.e("writetag/failure/tag too small");
                } else {
                    ndef.writeNdefMessage(ndefMessage);
                }
                ((ActivityC02290Ap) this).A0A.A07(R.string.link_write_error, 0);
                return;
            }
            NdefFormatable ndefFormatable = NdefFormatable.get(tag);
            if (ndefFormatable != null) {
                try {
                    ndefFormatable.connect();
                    ndefFormatable.format(ndefMessage);
                } catch (IOException e2) {
                    Log.e("writetag/failure/", e2);
                }
            }
            ((ActivityC02290Ap) this).A0A.A07(R.string.link_write_error, 0);
            return;
            Log.i("writetag/success");
            ((ActivityC02290Ap) this).A0A.A07(R.string.link_written_confirmation, 1);
            C0H9 c0h9 = this.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://com.whatsapp/");
            sb.append(R.raw.send_message);
            c0h9.A02(Uri.parse(sb.toString()));
            ((Vibrator) getSystemService("vibrator")).vibrate(75L);
            finish();
        }
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A01.disableForegroundDispatch(this);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A01.enableForegroundDispatch(this, this.A00, new IntentFilter[]{new IntentFilter("android.nfc.action.TAG_DISCOVERED")}, null);
    }
}
