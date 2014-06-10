// I really hope nobody ever goes through my Java experiments, 'cuz the
// naming convention here is in terribly bad taste.
// I really don't believe in this crap... Irony... Get it?!?!
// This is soooo gonna haunt me...

// Conclusion: if a variable refers still to an object, even if that object's
// original reference has been nulled, that object will still remain
// uncollected.

class Female {
	public int waist, hips, butt;

	public Female(int w, int h, int b) {
		waist = w;
		hips = h;
		butt = b;
	}
}

class Demo {
	public static void main(String[] argv) {
		Female theFem = new Female(36, 25, 33);
		Female maid, cook, whore;
		maid = cook = whore = theFem;

		System.out.println("Maid's measurements = " + maid.waist + "-" + maid.hips + "-" + maid.butt);
		System.out.println("Cook's measurements = " + cook.waist + "-" + cook.hips + "-" + cook.butt);

		// *Will* crash
		theFem = null;
		//System.out.println("theFem's measurements = " + theFem.waist + "-" + theFem.hips + "-" + theFem.butt);

		// But will this crash?
		System.out.println("Whore's measurements = " + cook.waist + "-" + cook.hips + "-" + cook.butt);
		// No.
	}
}
