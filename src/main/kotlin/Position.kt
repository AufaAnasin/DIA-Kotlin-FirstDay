class Position {
    private var positionId: Int = 0
//        get() { return field }
        set(value) { field = value }
    private var positionName: String = ""
        get() { return field }
        set(value) { field = value }

    constructor(positionId: Int, positionName: String) {
        this.positionId = positionId
        this.positionName = positionName
    }

    fun getPositionId():Int {
        return positionId
    }

    override fun toString(): String {
        return " Position ID: " + positionId + ", Position Name: " + positionName
    }
}