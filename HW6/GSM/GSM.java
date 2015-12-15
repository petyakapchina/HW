
public class GSM {
	String model;
	boolean hasSimCard;
	String simMObileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutcomingCall;

	boolean bothHasSim = false;
	boolean durationCorrect = false;
	boolean isSameNumber = true;

	void insertSimCard(String simMobileNumber) {
           if (simMobileNumber!=null) {
		if ((simMobileNumber.substring(0, 1) == "08") && (simMobileNumber.length() == 10)) {
			this.hasSimCard = true;
			this.simMObileNumber = simMobileNumber;
		} else {
			System.out.println("Innocrrect number!");
		}
	      }
            }
	void removeSimCard() {
		this.hasSimCard = false;
                this.simMobileNumber = "";
	}

	void call(GSM reciever, int duration) {
            if (reciever != null) {
		if (duration > 0 && duration <=60) {
			durationCorrect = true;
		}
		if ((!this.simMObileNumber.equals(receiver.simMobileNumber) && (this!= receiver)) {
			isSameNumber = false;
		}
		if ((reciever.hasSimCard = true) && (this.hasSimCard = true)) {
			bothHasSim = true;
		}

		if ((bothHasSim) && (durationCorrect) && (!isSameNumber)) {
                        Call newCall = new Call();
                        newCall.caller = this;
                        newCall.receiver = receiver;
                        newCall.duration = duration;
			this.lastOutcomingCall = newCall;
			reciever.lastIncomingCall = newCall;
                        this.outgoingCallsDuration+=duration;
		} else {
			System.out.println("Some of the data you hae entered is incorrect!");
		}
            }
	}
	void printLastOutcomingCall(){
		System.out.println("Last outcoming call was from: "+this.lastOutcomingCall.caller.simMobileNumber);
	}
	void printLastIncomingCall(){
		System.out.println("Last incoming call was from: "+this.lastIncomingCall.receiver.simMobileNumber);
	}
        double getSumForCall () {
		duration = this.outgoingCallsDuration;
	     return duration*new Call().priceForAMinute;	
	}

	}
