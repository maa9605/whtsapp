package com.whatsapp.voipcalling;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AnonymousClass011;
import X.AnonymousClass029;
import X.C000200d;
import X.C000700j;
import X.C018508q;
import X.C04000Ia;
import X.C04V;
import X.C07950aM;
import X.C0D3;
import X.C0HA;
import X.C0L6;
import X.C0MS;
import X.C0Mt;
import X.C25L;
import X.C27V;
import X.C28241Qv;
import X.C41641uH;
import X.C49032Ic;
import X.C74543dR;
import X.C74553dS;
import X.C74573dU;
import X.RunnableC73843cI;
import android.media.SoundPool;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.fieldstats.events.WamJoinableCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class VoiceService$VoiceServiceEventCallback implements VoipEventCallback {
    public final C74573dU bufferQueue = new C74573dU();
    public final C04000Ia mediaHttpClientFactory;
    public final /* synthetic */ C25L this$0;

    private boolean isFatalErrorCode(int i) {
        return i == 432;
    }

    public VoiceService$VoiceServiceEventCallback(C25L c25l, C04000Ia c04000Ia) {
        this.this$0 = c25l;
        this.mediaHttpClientFactory = c04000Ia;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void NoSamplingRatesForAudioRecord() {
        Log.i("VoiceService:NoSamplingRatesForAudioRecord");
        C25L c25l = this.this$0;
        c25l.A0a(23, c25l.A1b.A06(R.string.voip_call_failed_audio_record_issue));
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioDriverRestart() {
        Log.i("VoiceService:audioDriverRestart");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioInitError() {
        Log.i("VoiceService:audioInitError");
        this.this$0.A25.A03().remove("audio_sampling_hash").remove("audio_sampling_rates").apply();
        C25L c25l = this.this$0;
        c25l.A0a(23, c25l.A1b.A06(R.string.voip_call_failed_audio_record_issue));
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioRouteChangeRequest(int i) {
        Log.i("VoiceService:audioRouteChangeRequest");
        this.this$0.A0K.removeMessages(27);
        this.this$0.A0K.obtainMessage(27, i, 0).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioStreamStarted() {
        Log.i("VoiceService:audioStreamStarted");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void audioTestReplayFinished() {
        throw new AssertionError("audioTestReplayFinished is a debug only method");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void batteryLevelLow() {
        Log.i("VoiceService:batteryLevelLow");
        this.this$0.A0K.sendEmptyMessage(18);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callAcceptFailed() {
        Log.i("VoiceService:callAcceptFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callAcceptReceived() {
        Log.i("VoiceService:callAcceptReceived");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callAutoConnected(String str, String str2) {
        Log.i("VoiceService:callAutoConnected");
        Message.obtain(this.this$0.A0K, 31, new C74543dR(str, str2)).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callCaptureBufferFilled(Voip.DebugTapType debugTapType, byte[] bArr, int i, Voip.RecordingInfo[] recordingInfoArr) {
        C000700j.A06(false);
        if (bArr == null || bArr.length <= 0 || i <= 0 || recordingInfoArr == null) {
            return;
        }
        C25L.A2N.execute(new RunnableC73843cI(this, recordingInfoArr, debugTapType, bArr, i));
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callCaptureEnded(Voip.DebugTapType debugTapType, Voip.RecordingInfo[] recordingInfoArr) {
        C000700j.A06(false);
        C25L.A2N.execute(new RunnableEBaseShape6S0200000_I1(recordingInfoArr, debugTapType, 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x011c, code lost:
        if (r2.delete() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0135, code lost:
        if (r2.delete() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0137, code lost:
        com.whatsapp.util.Log.i("app/VoiceService: time series log could not be deleted");
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void callEnding(com.whatsapp.voipcalling.Voip.CallLogInfo r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callEnding(com.whatsapp.voipcalling.Voip$CallLogInfo, int, java.lang.String):void");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callMissed(String str, String str2, String str3, String str4, int i, long j, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3, boolean z4) {
        int i2;
        boolean z5;
        Log.i("VoiceService:callMissed");
        if (callGroupInfo != null && callGroupInfo.participants.length > 0) {
            i2 = callGroupInfo.transactionId;
        } else {
            i2 = -1;
        }
        C25L c25l = this.this$0;
        UserJid nullable = UserJid.getNullable(str2);
        if (nullable != null) {
            C0D3 A0A = c25l.A0A(nullable, false, str, i2);
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null) {
                z5 = str.equals(callInfo.callWaitingInfo.A04);
                if (A0A == null) {
                    return;
                }
                A0A.A0B(callInfo.groupJid);
            } else {
                z5 = false;
                if (A0A == null) {
                    return;
                }
            }
            this.this$0.A0t(str, A0A, 4, j, Integer.valueOf(i), str3, str4, z, callGroupInfo, z5, z2, z3, z4);
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferAcked() {
        Log.i("VoiceService:callOfferAcked");
        this.this$0.A0J.removeMessages(2);
        this.this$0.A0v = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            return;
        }
        if (callInfo.isJoinableGroupCall) {
            C0D3 A0A = this.this$0.A0A(callInfo.initialPeerJid, callInfo.isCaller, callInfo.callId, callInfo.initialGroupTransactionId);
            if (A0A != null) {
                for (UserJid userJid : callInfo.participants.keySet()) {
                    C28241Qv c28241Qv = (C28241Qv) callInfo.participants.get(userJid);
                    if (c28241Qv != null && !c28241Qv.A0E) {
                        A0A.A0C(userJid, 2);
                    }
                }
                A0A.A0D(callInfo.videoEnabled);
                A0A.A0A(DeviceJid.of(callInfo.creatorJid));
                this.this$0.A0k(A0A, true);
                this.this$0.A1e.A08(A0A);
            }
            this.this$0.A25.A08(callInfo.callId);
        }
        C25L.A05(this.this$0, callInfo.videoEnabled);
        if (Voip.A00("options.caller_end_call_threshold") != null) {
            this.this$0.A0e = Voip.A01("options.caller_end_call_threshold");
        }
        Voip.CallState callState = callInfo.callState;
        if (callState == Voip.CallState.CALLING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED) {
            Integer A01 = Voip.A01("options.caller_timeout");
            if (A01 != null) {
                long intValue = A01.intValue() * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C25L c25l = this.this$0;
                long j = intValue - (elapsedRealtime - c25l.A08);
                if (j > 0 && j < 120000) {
                    c25l.A0J.removeCallbacksAndMessages(null);
                    this.this$0.A0J.sendEmptyMessageDelayed(0, j);
                    StringBuilder sb = new StringBuilder("voip/receive_message/call-offer-ack change the caller timeout to ");
                    sb.append(intValue);
                    sb.append(", remaining ");
                    sb.append(j);
                    Log.i(sb.toString());
                }
            }
            this.this$0.A0n(callInfo.callState);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x004e, code lost:
        if (isSelfNacked(r11) != false) goto L44;
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[] r11) {
        /*
            r10 = this;
            com.whatsapp.voipcalling.CallInfo r6 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r6 != 0) goto Lc
            java.lang.String r0 = "we are not in a active call"
            com.whatsapp.util.Log.e(r0)
            return
        Lc:
            if (r11 == 0) goto L8b
            int r8 = r11.length
            if (r8 == 0) goto L8b
            r9 = 0
            r5 = 1
            if (r8 != r5) goto L27
            r0 = r11[r9]
            int r1 = r0.errorCode
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L21
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L27
        L21:
            java.lang.String r0 = "Server received duplicate offers. Just return"
            com.whatsapp.util.Log.w(r0)
            return
        L27:
            java.lang.String r0 = "VoiceService:callOfferNacked error: "
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r8)
            java.util.Map r0 = r6.participants
            int r1 = r0.size()
            int r1 = r1 - r5
            r0 = r11[r9]
            int r3 = r0.errorCode
            if (r1 == r8) goto L50
            boolean r0 = r10.isSelfNacked(r11)
            r7 = 0
            if (r0 == 0) goto L51
        L50:
            r7 = 1
        L51:
            r2 = 0
        L52:
            if (r2 >= r8) goto L74
            r1 = r11[r2]
            int r0 = r1.errorCode
            boolean r0 = r10.isFatalErrorCode(r0)
            if (r7 != 0) goto L6b
            if (r0 == 0) goto L62
            int r3 = r1.errorCode
        L62:
            int r0 = r1.errorCode
            boolean r0 = r10.isFatalErrorCode(r0)
            r7 = 0
            if (r0 == 0) goto L6c
        L6b:
            r7 = 1
        L6c:
            com.whatsapp.jid.UserJid r0 = r1.errorJid
            r4.add(r0)
            int r2 = r2 + 1
            goto L52
        L74:
            com.whatsapp.voipcalling.Voip$CallState r1 = r6.callState
            com.whatsapp.voipcalling.Voip$CallState r0 = com.whatsapp.voipcalling.Voip.CallState.CALLING
            if (r1 != r0) goto L7d
            if (r7 == 0) goto L7d
            r9 = 1
        L7d:
            X.25L r0 = r10.this$0
            r0.A0v = r5
            if (r9 == 0) goto L87
            r10.handleFatalOfferNack(r4, r3, r6)
            return
        L87:
            r10.handleNonFatalOfferNack(r4, r3)
            return
        L8b:
            java.lang.String r0 = "Received offer nack without any errors"
            com.whatsapp.util.Log.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callOfferNacked(com.whatsapp.voipcalling.CallOfferAckError[]):void");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferReceiptReceived() {
        Log.i("VoiceService:callOfferReceiptReceived");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferReceived() {
        Log.i("VoiceService:callOfferReceived");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callOfferSent() {
        Log.i("VoiceService:callOfferSent");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callPreAcceptReceived() {
        Log.i("VoiceService:callPreAcceptReceived");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0057, code lost:
        if (r12.equals("uncallable") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0059, code lost:
        r1 = r4.videoEnabled;
        r6 = r10.this$0.A1b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005f, code lost:
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0061, code lost:
        r2 = r6.A0D(com.google.android.search.verification.client.R.string.voip_video_call_old_os_ver, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007a, code lost:
        r2 = r6.A0A(com.google.android.search.verification.client.R.plurals.voip_not_allowed_at_this_time_plural, 1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a2, code lost:
        if (r12.equals("tos") != false) goto L19;
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void callRejectReceived(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callRejectReceived(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0119, code lost:
        if (r4 != 7) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x017a A[ORIG_RETURN, RETURN] */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void callStateChanged(com.whatsapp.voipcalling.Voip.CallState r9, com.whatsapp.voipcalling.CallInfo r10) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.callStateChanged(com.whatsapp.voipcalling.Voip$CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callTerminateReceived(String str) {
        C04V c04v;
        Pair A00;
        C0Mt c0Mt;
        C000200d.A14("VoiceService:callTerminateReceived, callId:", str);
        if (str == null || TextUtils.equals(Voip.getCurrentCallId(), str) || !C0L6.A03() || (A00 = (c04v = Voip.A01).A00(str)) == null || (c0Mt = (C0Mt) A00.second) == null) {
            return;
        }
        C0D3 A04 = this.this$0.A1e.A04(new C07950aM(c0Mt.A00(), false, AnonymousClass029.A0t(str), c0Mt.A00));
        if (A04 != null) {
            C25L c25l = this.this$0;
            C27V c27v = c0Mt.A01;
            c25l.A0t(str, A04, 4, c27v.A00, 5, c27v.A05, c27v.A04, false, c0Mt.A02, false, c0Mt.A03, A04.A0D, false);
        }
        c04v.A01(str);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void callWaitingStateChanged(int i) {
        String str;
        StringBuilder sb = new StringBuilder("VoiceService:callWaitingStateChanged ");
        sb.append(i);
        Log.i(sb.toString());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            str = callInfo.callWaitingInfo.A04;
        } else {
            str = null;
        }
        this.this$0.A0K.removeMessages(34);
        this.this$0.A0K.obtainMessage(34, i, 0, str).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void errorGatheringHostCandidates() {
        Log.i("VoiceService:errorGatheringHostCandidates");
    }

    /* JADX WARN: Code restructure failed: missing block: B:225:0x00df, code lost:
        if (r3 > 100.0f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x014f, code lost:
        if (((android.media.audiofx.AcousticEchoCanceler) r0).getEnabled() != false) goto L172;
     */
    @Override // com.whatsapp.voipcalling.VoipEventCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void fieldstatsReady(com.whatsapp.fieldstats.events.WamCall r22, java.lang.String r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback.fieldstatsReady(com.whatsapp.fieldstats.events.WamCall, java.lang.String, boolean, boolean):void");
    }

    public byte[] getByteBuffer(int i) {
        C74573dU c74573dU = this.bufferQueue;
        synchronized (c74573dU) {
            Iterator it = c74573dU.A01.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr.length >= i) {
                    it.remove();
                    return bArr;
                }
            }
            c74573dU.A00 += i;
            return new byte[i];
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void groupInfoChanged() {
        boolean z;
        Log.i("VoiceService:groupInfoChanged");
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (callInfo.callState == Voip.CallState.NONE) {
                z = true;
            } else {
                this.this$0.A0K.removeMessages(25);
                this.this$0.A0K.sendEmptyMessage(25);
                if (AnonymousClass029.A1O(this.this$0.A1O) && callInfo.isGroupCall) {
                    Voip.CallState callState = callInfo.callState;
                    if (callState == Voip.CallState.CALLING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED) {
                        this.this$0.A0J.removeMessages(5);
                        Integer A01 = Voip.A01("options.caller_lonely_state_timeout");
                        this.this$0.A0J.sendEmptyMessageDelayed(5, A01 == null ? 3600000L : A01.longValue() * 1000);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            z = false;
        }
        C000700j.A08(z, " CallInfo should not be null in groupInfoChanged callback");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void groupParticipantLeft(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder("VoiceService:groupParticipantLeft (");
        sb.append(i);
        sb.append(")");
        Log.i(sb.toString());
        if (i == 4) {
            if (str2 == null) {
                str2 = "";
            }
            callRejectReceived(str, str2);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleAcceptAckFailed(String str, int i) {
        StringBuilder sb = new StringBuilder("VoiceService:handleAcceptAckFailed, error_code = ");
        sb.append(i);
        sb.append("error_raw_device_jid: ");
        sb.append(str);
        Log.i(sb.toString());
        if (i != 434) {
            this.this$0.A0a(25, null);
        } else {
            this.this$0.A0a(26, null);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleAcceptFailed() {
        Log.i("VoiceService:handleAcceptFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleCallFatal(int i) {
        C000200d.A0q("VoiceService:handleCallFatal Reason: ", i);
        AbstractC000600i abstractC000600i = this.this$0.A1I;
        StringBuilder sb = new StringBuilder("voip/callFatal Reason:");
        sb.append(i);
        abstractC000600i.A09("VoiceServiceEventCallback/handleCallFatal", sb.toString(), true);
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleFDLeakDetected() {
        Log.i("VoiceService:handleFDLeakDetected");
    }

    private void handleFatalOfferNack(ArrayList arrayList, int i, CallInfo callInfo) {
        int i2 = 3;
        if (i != 401) {
            int i3 = 2;
            if (i != 460) {
                i2 = 15;
                if (i != 431) {
                    if (i != 432) {
                        i2 = 0;
                        switch (i) {
                            case 403:
                                if (callInfo.videoEnabled) {
                                    i2 = 7;
                                    break;
                                }
                                break;
                            case 404:
                                i2 = 16;
                                break;
                            case 405:
                                i2 = 4;
                                break;
                            case 406:
                                if (callInfo.videoEnabled) {
                                    i3 = 11;
                                    break;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 426:
                                        i2 = 1;
                                        if (callInfo.videoEnabled) {
                                            i2 = 9;
                                            break;
                                        }
                                        break;
                                    case 427:
                                        i2 = 12;
                                        break;
                                    case 428:
                                        i2 = 14;
                                        break;
                                    default:
                                        if (callInfo.videoEnabled) {
                                            i2 = 8;
                                            break;
                                        }
                                        break;
                                }
                        }
                    } else {
                        C25L.A04(this.this$0, arrayList, 2);
                        i2 = -1;
                    }
                }
            } else if (callInfo.videoEnabled) {
                i3 = 10;
            }
            i2 = i3;
        }
        if (i2 != -1) {
            C25L c25l = this.this$0;
            C018508q c018508q = c25l.A1K;
            c018508q.A02.post(new RunnableEBaseShape0S1201000_I0(c25l, arrayList, null, i2, 4));
        }
        this.this$0.A0a(25, null);
    }

    private void handleNonFatalOfferNack(List list, int i) {
        String A0A;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.this$0.A1U.A04(this.this$0.A1T.A0A((AbstractC005302j) it.next())));
        }
        int i2 = 1;
        String A0o = AnonymousClass029.A0o(this.this$0.A1U.A04, true, arrayList);
        if (i == 427) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo != null) {
                C28241Qv infoByJid = list.size() == 1 ? callInfo.getInfoByJid((UserJid) list.get(0)) : null;
                if (callInfo.isGroupCall && callInfo.participants.size() > 4) {
                    C25L c25l = this.this$0;
                    if (infoByJid != null && infoByJid.A0D) {
                        i2 = 6;
                    }
                    C25L.A04(c25l, list, i2);
                    return;
                } else if (infoByJid != null && infoByJid.A01 == 1) {
                    A0A = this.this$0.A1b.A0D(R.string.voip_peer_group_call_not_supported, arrayList.get(0));
                }
            }
            A0A = this.this$0.A1b.A0A(R.plurals.voip_group_call_not_supported_plural, list.size(), A0o);
        } else if (i == 428) {
            A0A = this.this$0.A1b.A0D(R.string.voip_group_call_reach_maximum_during_call, arrayList.get(0));
        } else if (i != 431) {
            C000700j.A08(false, "Unknown error code");
            A0A = this.this$0.A1b.A0A(R.plurals.voip_not_allowed_at_this_time_plural, list.size(), A0o);
        } else {
            A0A = this.this$0.A1b.A0D(R.string.unable_to_add_participant_to_group_call, A0o);
        }
        Message.obtain(this.this$0.A0K, 26, A0A).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleOfferAckFailed() {
        Log.i("VoiceService:handleOfferAckFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handleOfferFailed() {
        Log.i("VoiceService:handleOfferFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void handlePreAcceptFailed() {
        Log.i("VoiceService:handlePreAcceptFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void interruptionStateChanged() {
        Log.i("VoiceService:interruptionStateChanged");
        this.this$0.A0K.removeMessages(30);
        this.this$0.A0K.obtainMessage(30).sendToTarget();
        C41641uH c41641uH = this.this$0.A22;
        c41641uH.A00.obtainMessage(1, new C49032Ic("refresh_notification", null, null)).sendToTarget();
    }

    private boolean isSelfNacked(CallOfferAckError[] callOfferAckErrorArr) {
        for (CallOfferAckError callOfferAckError : callOfferAckErrorArr) {
            if (this.this$0.A1L.A0A(callOfferAckError.errorJid)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void joinableFieldstatsReady(WamJoinableCall wamJoinableCall, boolean z) {
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("VoiceService:joinableFieldstatsReady not in an active call");
            return;
        }
        C74553dS A0C = this.this$0.A0C(callInfo.callId);
        String A0D = this.this$0.A0D(callInfo.callId, wamJoinableCall.callRandomId);
        wamJoinableCall.callRandomId = A0D;
        StringBuilder A0P = C000200d.A0P("VoiceService:joinableFieldstatsReady callRandomId:");
        A0P.append(A0D);
        A0P.append(" realtime:");
        A0P.append(z);
        Log.i(A0P.toString());
        C25L c25l = this.this$0;
        int i = c25l.A0g;
        if (i == null) {
            if (c25l.A0A == 0) {
                i = 5;
                c25l.A0g = 5;
            } else {
                C000700j.A08(false, "Bug with tracking call lobby");
                c25l = this.this$0;
                i = 0;
                c25l.A0g = 0;
            }
        }
        wamJoinableCall.lobbyEntryPoint = i;
        long j = c25l.A0A;
        if (j > 0) {
            wamJoinableCall.lobbyVisibleT = Long.valueOf(System.currentTimeMillis() - j);
        }
        if (A0C.A01) {
            wamJoinableCall.isRering = Boolean.TRUE;
        }
        if (c25l.A15) {
            wamJoinableCall.previousJoinNotEnded = Boolean.TRUE;
        }
        C0HA c0ha = c25l.A1h;
        c0ha.A0B.A09(wamJoinableCall, 1);
        AnonymousClass011.A01(wamJoinableCall, "");
        if (z) {
            c0ha.A0B.A03();
        }
    }

    public /* synthetic */ void lambda$callCaptureBufferFilled$2706$VoiceService$VoiceServiceEventCallback(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType, byte[] bArr, int i) {
        int ordinal = debugTapType.ordinal();
        Voip.RecordingInfo recordingInfo = recordingInfoArr[ordinal];
        if (recordingInfo == null) {
            recordingInfoArr[ordinal] = new Voip.RecordingInfo(this.this$0.A1J, debugTapType);
            recordingInfo = recordingInfoArr[ordinal];
        }
        OutputStream outputStream = recordingInfo.outputStream;
        if (outputStream == null) {
            Log.e("voip/callCaptureBufferFilled/OutputStream/null");
            Voip.stopCallRecording();
            return;
        }
        try {
            outputStream.write(bArr, 0, i);
        } catch (IOException e) {
            Log.e(e);
        }
        C74573dU c74573dU = this.bufferQueue;
        synchronized (c74573dU) {
            if (bArr != null) {
                c74573dU.A01.addFirst(bArr);
            }
        }
        if (recordingInfo.outputFile.length() >= 52428800) {
            Log.i("callCaptureBufferFilled stop recording due to exceeds file size limit");
            Voip.stopCallRecording();
        }
    }

    public static /* synthetic */ void lambda$callCaptureEnded$2707(Voip.RecordingInfo[] recordingInfoArr, Voip.DebugTapType debugTapType) {
        OutputStream outputStream;
        Voip.RecordingInfo recordingInfo = recordingInfoArr[debugTapType.ordinal()];
        if (recordingInfo == null || (outputStream = recordingInfo.outputStream) == null) {
            return;
        }
        try {
            outputStream.close();
            StringBuilder sb = new StringBuilder();
            sb.append("callCaptureEnded ");
            sb.append(recordingInfo.outputFile);
            sb.append(" size ");
            sb.append(recordingInfo.outputFile.length());
            Log.i(sb.toString());
        } catch (IOException e) {
            Log.e(e);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void lobbyNacked(int i, String str) {
        Log.i("VoiceService:lobbyNacked");
        if (str.equals(Voip.getCurrentCallId())) {
            this.this$0.A0a(25, null);
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void mediaStreamError() {
        Log.i("VoiceService:mediaStreamError");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void mediaStreamStartError() {
        Log.i("VoiceService:mediaStreamStartError");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void missingRelayInfo() {
        Log.i("VoiceService:missingRelayInfo");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void muteStateChanged() {
        Log.i("VoiceService:muteStateChanged");
        this.this$0.A0K.removeMessages(32);
        this.this$0.A0K.sendEmptyMessage(32);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pNegotaitionFailed() {
        Log.i("VoiceService:p2pNegotaitionFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pNegotiationSuccess() {
        Log.i("VoiceService:p2pNegotiationSuccess");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportCreateFailed() {
        Log.i("VoiceService:p2pTransportCreateFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportMediaCreateFailed() {
        Log.i("VoiceService:p2pTransportMediaCreateFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportRestartSuccess() {
        Log.i("VoiceService:p2pTransportRestartSuccess");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void p2pTransportStartFailed() {
        Log.i("VoiceService:p2pTransportStartFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void peerBatteryLevelLow(String str) {
        UserJid nullable = UserJid.getNullable(str);
        if (nullable != null) {
            C000200d.A0x("VoiceService:peerBatteryLevelLow, Jid:", nullable);
            C25L c25l = this.this$0;
            if (c25l != null) {
                Message message = new Message();
                message.what = 19;
                message.obj = nullable;
                c25l.A0K.sendMessageDelayed(message, 3000L);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void peerVideoStateChanged(int i) {
        C000200d.A0q("VoiceService:peerVideoStateChanged ", i);
        this.this$0.A0K.removeMessages(12);
        this.this$0.A0K.obtainMessage(12, i, 0).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void playCallTone(int i) {
        C000200d.A0q("VoiceService:playCallTone type:", i);
        Number number = (Number) this.this$0.A2D.get(Integer.valueOf(i));
        C25L c25l = this.this$0;
        if (c25l.A0H == null) {
            c25l.A0H = new SoundPool(1, 0, 0);
        }
        if (number != null) {
            C25L c25l2 = this.this$0;
            float f = c25l2.A23.A00 == 2 ? 1.0f : 0.5f;
            c25l2.A0H.play(number.intValue(), f, f, 0, 0, 1.0f);
            return;
        }
        Log.e("VoiceService:playCallTone sound pool has not been loaded successfully");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rejectedDecryptionFailure(String str, String str2, byte[] bArr, int i) {
        DeviceJid nullable = DeviceJid.getNullable(str);
        if (nullable != null) {
            StringBuilder sb = new StringBuilder("VoiceService:rejectedDecryptionFailure, Jid:");
            sb.append(nullable);
            sb.append(", callId:");
            sb.append(str2);
            sb.append(", retryCount:");
            C000200d.A1F(sb, i);
            this.this$0.A2B.put(nullable, str2);
            if (!this.this$0.A1x.A02(nullable, AnonymousClass029.A0t(str2), bArr, i)) {
                this.this$0.A0a(27, null);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayBindsFailed(boolean z) {
        String A06;
        StringBuilder sb = new StringBuilder("VoiceService:relayBindsFailed self bad asn=");
        sb.append(z);
        Log.i(sb.toString());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e("we are not in a active call");
            return;
        }
        C25L c25l = this.this$0;
        c25l.A11 = z;
        int A03 = c25l.A1W.A03(true);
        if (A03 == 0) {
            c25l.A0a(3, c25l.A1b.A06(R.string.voip_call_failed_no_network));
            return;
        }
        if (callInfo.isCaller || callInfo.callState == Voip.CallState.ACCEPT_SENT) {
            if (c25l.A11) {
                if (A03 == 1) {
                    A06 = c25l.A1b.A06(R.string.voip_not_connected_wifi);
                } else {
                    A06 = c25l.A1b.A06(R.string.voip_not_connected_cellular);
                }
            } else if (A03 == 1) {
                A06 = c25l.A1b.A06(R.string.voip_call_failed_incompatible_wifi);
            } else {
                A06 = c25l.A1b.A06(R.string.voip_call_failed_incompatible_cellular);
            }
            UserJid userJid = callInfo.peerJid;
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(userJid);
            C018508q c018508q = c25l.A1K;
            c018508q.A02.post(new RunnableEBaseShape0S1201000_I0(c25l, arrayList, A06, 5, 4));
        }
        c25l.A0a(3, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayCreateSuccess() {
        Log.i("VoiceService:relayCreateSuccess");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayElectionSendFailed() {
        Log.i("VoiceService:relayElectionSendFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void relayLatencySendFailed() {
        Log.i("VoiceService:relayLatencySendFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void restartCamera() {
        C0MS c0ms;
        Log.i("VoiceServiceEventCallback:restartCamera");
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null || (c0ms = this.this$0.A0Z) == null) {
            return;
        }
        C28241Qv c28241Qv = callInfo.self;
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) c0ms;
        Log.i("VoipActivityV2/restartCameraPreview ");
        voipActivityV2.A0E.removeMessages(12);
        voipActivityV2.A1q();
        voipActivityV2.A2N(voipActivityV2.A1A, c28241Qv);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rtcpByeReceived() {
        Log.i("VoiceService:rtcpByeReceived");
        this.this$0.A0a(18, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTimeout() {
        Log.i("VoiceService:rxTimeout");
        this.this$0.A0a(5, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTrafficStarted() {
        Log.i("VoiceService:rxTrafficStarted");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTrafficStateForPeerChanged() {
        Log.i("VoiceService:rxTrafficStateForPeerChanged");
        this.this$0.A0K.removeMessages(33);
        this.this$0.A0K.sendEmptyMessage(33);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void rxTrafficStopped() {
        boolean z = this.this$0.A1H.A00;
        StringBuilder A0P = C000200d.A0P("VoiceService:rxTrafficStopped.  powerSavingMode: ");
        A0P.append(this.this$0.A0y());
        A0P.append(", isAppInForeground: ");
        A0P.append(z);
        A0P.append(", screenLocked: ");
        C000200d.A1V(A0P, this.this$0.A16);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void selfVideoStateChanged(int i) {
        C000200d.A0q("VoiceService:selfVideoStateChanged ", i);
        this.this$0.A0K.removeMessages(11);
        this.this$0.A0K.obtainMessage(11, i, 0).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void sendAcceptFailed() {
        Log.i("VoiceService:sendAcceptFailed");
        this.this$0.A0K();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void sendOfferFailed() {
        Log.i("VoiceService:sendOfferFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void soundPortCreateFailed() {
        Log.i("VoiceService:soundPortCreateFailed");
        this.this$0.A0a(27, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void soundPortCreated(int i) {
        StringBuilder sb = new StringBuilder("VoiceService:soundPortCreated with engine type ");
        sb.append(i);
        Log.i(sb.toString());
        Integer A01 = Voip.A01("aec.builtin");
        C25L c25l = this.this$0;
        if (c25l.A0n == null && A01 != null) {
            int intValue = A01.intValue();
            if (intValue == 2) {
                c25l.A0n = Voip.A02(c25l.A1y.previousAudioSessionId, true);
            } else if (intValue == 3) {
                c25l.A0n = Voip.A02(c25l.A1y.previousAudioSessionId, false);
            }
        }
        Integer A012 = Voip.A01("agc.builtin");
        C25L c25l2 = this.this$0;
        if (c25l2.A0o == null && A012 != null) {
            int intValue2 = A012.intValue();
            if (intValue2 == 2) {
                c25l2.A0o = Voip.A03(c25l2.A1y.previousAudioSessionId, true);
            } else if (intValue2 == 3) {
                c25l2.A0o = Voip.A03(c25l2.A1y.previousAudioSessionId, false);
            }
        }
        Integer A013 = Voip.A01("ns.builtin");
        C25L c25l3 = this.this$0;
        if (c25l3.A0p == null && A013 != null) {
            int intValue3 = A013.intValue();
            if (intValue3 == 2) {
                c25l3.A0p = Voip.A04(c25l3.A1y.previousAudioSessionId, true);
            } else if (intValue3 != 3) {
            } else {
                c25l3.A0p = Voip.A04(c25l3.A1y.previousAudioSessionId, false);
            }
        }
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void syncDevices(SyncDevicesUserInfo[] syncDevicesUserInfoArr) {
        ArrayList A0Y = C000200d.A0Y("VoiceService:syncDevices");
        for (SyncDevicesUserInfo syncDevicesUserInfo : syncDevicesUserInfoArr) {
            if (!this.this$0.A1g.A0D(new UserJid[]{syncDevicesUserInfo.jid}, syncDevicesUserInfo.phash)) {
                A0Y.add(syncDevicesUserInfo.jid);
            }
        }
        if (A0Y.isEmpty()) {
            return;
        }
        this.this$0.A1V.A02((UserJid[]) A0Y.toArray(new UserJid[0]), 4);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void transportCandSendFailed() {
        Log.i("VoiceService:transportCandSendFailed");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void txTimeout() {
        Log.i("VoiceService:txTimeout");
        this.this$0.A0a(6, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void updateJoinableCallLog(int i, String str, UserJid[] userJidArr) {
        Log.i("VoiceService:updateJoinableCallLog");
        Message obtainMessage = this.this$0.A0K.obtainMessage(36, i, 0, str);
        if (i == 2) {
            obtainMessage.getData().putParcelableArray("participant_jids", userJidArr);
        }
        obtainMessage.sendToTarget();
    }

    private void validateCallState(Voip.CallState callState) {
        C000700j.A09(callState != Voip.CallState.RECEIVED_CALL_WITHOUT_OFFER, "This call state is not supported in Android");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoCaptureStarted() {
        Log.i("VoiceService:videoCaptureStarted");
        this.this$0.A0K.sendEmptyMessage(13);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoCodecMismatch() {
        Log.i("VoiceService:videoCodecMismatch");
        this.this$0.A1K.A04(R.string.video_call_fallback_to_voice_call);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoCodecStateChanged() {
        Log.i("VoiceService:videoCodecStateChanged");
        this.this$0.A0K.removeMessages(15);
        this.this$0.A0K.sendEmptyMessage(15);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodeFatalError() {
        Log.i("VoiceService:videoDecodeFatalError");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodePaused() {
        Log.i("VoiceService:videoDecodePaused");
        this.this$0.A0K.removeMessages(15);
        this.this$0.A0K.sendEmptyMessage(15);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodeResumed() {
        Log.i("VoiceService:videoDecodeResumed");
        this.this$0.A0K.removeMessages(15);
        this.this$0.A0K.sendEmptyMessage(15);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoDecodeStarted() {
        Log.i("VoiceService:videoDecodeStarted");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoEncodeFatalError() {
        Log.i("VoiceService:videoEncodeFatalError");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPortCreateFailed() {
        Log.i("VoiceService:videoPortCreateFailed");
        this.this$0.A0a(17, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPortCreated(String str) {
        C000200d.A14("VoiceService:videoPortCreated ", str);
        this.this$0.A0K.obtainMessage(7).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPreviewError() {
        Log.i("VoiceService:videoPreviewError");
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoPreviewReady() {
        Log.i("VoiceService:videoPreviewReady");
        this.this$0.A0K.sendEmptyMessage(9);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoRenderFormatChanged(String str) {
        this.this$0.A0K.obtainMessage(10, str).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoRenderStarted(String str) {
        C000200d.A14("VoiceService:videoRenderStarted ", str);
        this.this$0.A0K.obtainMessage(8, str).sendToTarget();
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void videoStreamCreateError() {
        Log.i("VoiceService:videoStreamCreateError");
        this.this$0.A0a(16, null);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void weakWifiSwitchedToCellular() {
        Log.i("VoiceService:weakWifiSwitchedToCellular");
        this.this$0.A0K.sendEmptyMessage(35);
    }

    @Override // com.whatsapp.voipcalling.VoipEventCallback
    public void willCreateSoundPort() {
        Log.i("VoiceService:willCreateSoundPort");
    }
}
