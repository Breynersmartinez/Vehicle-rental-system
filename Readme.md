# Entities, attributes and  methods

## 1) Vehicle
- - plate : String 
- - brand : String 
- - model : String
- - autonomy : int
- - typeEnergy : String
- - Aviable : Boolean // disponibilidad 
- + clone() : Vehicle
- + getType() : String 

## 2) Car extends of Vehicle
- - numberDoors : int 
`- + clone() : Vehicle
`- + getType() : String

## 3) Van  extends of Vehicle
- - passengerCapacity : int 
- + clone() : Vehicle
- + getType() : String

## 4) Truck extends of Vehicle
- - loadCapacity
- + clone() : Vehicle
- + getType() : String

# Inventory of vehicles

## 1) inventory
- - maximumCapacity : int -> constant
- - vehicle[] : Vehicle
- - amount : int
- - prototypeRegistration : Record
- + addVehicles() : Boolean
- + searchByPlate(): Vehicle
- + orderForAutonomy() : void
- + showInventory() : void
- + getAviableVehicles() : Vehicle[]


# Contract Template

## 1) Client
- - name : String
- - idCard: String 
- - typeClient : String
- + toString() : String

## 2) RetalPlan
- - TypePlan : type
- - duration : int 
- - baseRate : Double
- - discount : Double
- + applyDiscount : void
- + calculateCosts : Double

## 3) ContractAgreement
- - contractNumber : String
- - client : Client
- - vehicle : Vehicle
- - plan : RentalPlan
- - accessories : List<String>
- - startDate : Date
- - totalCost : Double
- - valid : Boolean
- + 