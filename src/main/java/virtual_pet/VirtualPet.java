package virtual_pet;





public class VirtualPet {
    public String name;
    public int hungerLevel;
    public int thirstLevel;
    public int needToGoOutsideLevel;
    public int fatigue;


    public VirtualPet(String name, int hungerLevel, int thirstLevel, int needToGoOutsideLevel, int fatigue) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.needToGoOutsideLevel = needToGoOutsideLevel;
        this.fatigue = fatigue;
    }

    public void feedTheDangDog() {
        hungerLevel = hungerLevel - 20;

    }

    public void waterTheDangDog() {
        System.out.println("test");
        thirstLevel = thirstLevel - 20;
    }

    public void putTheDangDogOutside() {
        needToGoOutsideLevel = needToGoOutsideLevel - 20;

    }

    public void putTheDangDogToBed() {
        fatigue = fatigue - 20;
    }

    public void tick() {
            hungerLevel = hungerLevel + 10;
            thirstLevel = thirstLevel + 10;
            needToGoOutsideLevel = needToGoOutsideLevel + 10;
            fatigue = fatigue + 10;
    }
}

